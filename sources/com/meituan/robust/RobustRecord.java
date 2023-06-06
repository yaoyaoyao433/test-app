package com.meituan.robust;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustRecord {
    private static final int END = 2;
    private static final String END_STRING = "END";
    private static final int START = 1;
    private static final String START_STRING = "START";
    public String id;
    public int state;
    public long threadId;
    public String threadName;
    public long time;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStart() {
        this.state = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEnd() {
        this.state = 2;
    }

    public boolean isStart() {
        return 1 == this.state;
    }

    public boolean isEnd() {
        return 2 == this.state;
    }

    public String getStateString() {
        return isStart() ? START_STRING : isEnd() ? END_STRING : "unknown";
    }
}
