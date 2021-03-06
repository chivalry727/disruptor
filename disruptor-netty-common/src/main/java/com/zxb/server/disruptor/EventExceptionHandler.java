package com.zxb.server.disruptor;

import com.lmax.disruptor.ExceptionHandler;
import com.zxb.server.entity.TranslatorDataWrapper;

/**
 * class
 *
 * @author Mr.zxb
 * @date 2019-11-29 14:27
 */
public class EventExceptionHandler implements ExceptionHandler<TranslatorDataWrapper> {
    @Override
    public void handleEventException(Throwable ex, long sequence, TranslatorDataWrapper event) {
        System.out.println("处理事件异常：" + ex.getMessage());
    }

    @Override
    public void handleOnStartException(Throwable ex) {
        System.out.println("处理启动异常：" + ex.getMessage());
    }

    @Override
    public void handleOnShutdownException(Throwable ex) {
        System.out.println("处理关机异常：" + ex.getMessage());
    }
}
