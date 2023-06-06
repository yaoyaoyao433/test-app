package org.apache.flink.cep.mlink.ikexpression;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b extends Exception {
    private static final long serialVersionUID = -382075370364295450L;
    private String a;
    private int b;

    public b() {
        this.b = -1;
    }

    public b(String str) {
        super(str);
        this.b = -1;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(getMessage());
        stringBuffer.append("\r\n处理对象：");
        stringBuffer.append(this.a);
        stringBuffer.append("\r\n处理位置：");
        stringBuffer.append(this.b == -1 ? " unknow " : Integer.valueOf(this.b));
        return stringBuffer.toString();
    }
}
