package com.lvzheng.service.sso.system;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluatorBase;

import java.util.Date;

public class CounterBasedEvaluator extends EventEvaluatorBase<ILoggingEvent> {

    /**
     * 40个error发一次邮件
     */
    private static final int LIMIT = 10;

    /**
     * 当前积攒了多少error
     */
    private int counter = 0;

    /**
     * 最后一次发送的时间
     */
    private Date lastSendTime = new Date();

    /**
     * 间隔  默认10分钟
     */
    private static final Long INTERVAL = 1000 * 60 * 10L;

    /**
     * @see ch.qos.logback.core.boolex.EventEvaluator#evaluate(Object)
     */

    @Override
    public boolean evaluate(ILoggingEvent event) throws EvaluationException {
        counter++;
        if (counter >= LIMIT || ((new Date().getTime() - lastSendTime.getTime()) > INTERVAL)) {
            counter = 0;
            lastSendTime = new Date();
            return true;
        } else {
            return false;
        }
    }
}
