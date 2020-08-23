package com.ah.util;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.PublicKey;

public class TransactionInvocationHandler implements InvocationHandler {

    private  Object target;

    public TransactionInvocationHandler(Object target){
        this.target = target;
    }

    /**
     * 代理类的业务方法
     * invoke是动态代理的方法
     * @param proxy 代理
     * @param method  方法
     * @param args
     * @return
     * @throws Throwable
     */

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SqlSession session = null;
        Object obj = null;
        try {
            //打开链接
            session = MyBatisUtil.getSeccion();
            //处理业务逻辑
            obj = method.invoke(target,args);
            //处理事务逻辑后提交事务
            session.commit();
        }catch (Exception e){
            //事务回滚
            session.rollback();
            e.printStackTrace();
        }finally {
            MyBatisUtil.colse(session);
        }
        return obj;
    }



public Object getProxy(){
        //获取动态代理的方法
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
}















}
