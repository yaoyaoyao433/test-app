package com.meituan.robust;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustMethodLifeCallBackImpl implements RobustMethodLifeCallBack {
    private String key;

    public RobustMethodLifeCallBackImpl(String str) {
        this.key = str;
    }

    @Override // com.meituan.robust.RobustMethodLifeCallBack
    public void start(RobustMethodLifeArgs robustMethodLifeArgs) {
        RobustRecord robustRecord = new RobustRecord();
        robustRecord.id = robustMethodLifeArgs.methodNumber;
        robustRecord.time = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        robustRecord.threadId = currentThread.getId();
        robustRecord.threadName = currentThread.getName();
        robustRecord.setStart();
        RobustRecorder.addRecord(this.key, robustRecord);
    }

    @Override // com.meituan.robust.RobustMethodLifeCallBack
    public void end(RobustMethodLifeArgs robustMethodLifeArgs) {
        RobustRecord robustRecord = new RobustRecord();
        robustRecord.id = robustMethodLifeArgs.methodNumber;
        robustRecord.time = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        robustRecord.threadId = currentThread.getId();
        robustRecord.threadName = currentThread.getName();
        robustRecord.setEnd();
        RobustRecorder.addRecord(this.key, robustRecord);
    }
}
