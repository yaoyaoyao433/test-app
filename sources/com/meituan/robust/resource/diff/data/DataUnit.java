package com.meituan.robust.resource.diff.data;

import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DataUnit {
    public String diffMd5;
    public String name;
    public long newCrc;
    public String newMd5;
    public String oldMd5;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.name);
        stringBuffer.append(CommonConstant.Symbol.COMMA);
        stringBuffer.append(this.oldMd5);
        stringBuffer.append(CommonConstant.Symbol.COMMA);
        stringBuffer.append(this.newMd5);
        stringBuffer.append(CommonConstant.Symbol.COMMA);
        stringBuffer.append(this.diffMd5);
        stringBuffer.append(CommonConstant.Symbol.COMMA);
        stringBuffer.append(this.newCrc);
        return stringBuffer.toString();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof DataUnit) && this.name.equals(((DataUnit) obj).name)) {
            return true;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
