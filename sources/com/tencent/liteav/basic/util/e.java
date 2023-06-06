package com.tencent.liteav.basic.util;

import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e {
    public int a;
    public int b;

    public e() {
    }

    public e(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return eVar.a == this.a && eVar.b == this.b;
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 32713) + this.b;
    }

    public String toString() {
        return "Size(" + this.a + ", " + this.b + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
