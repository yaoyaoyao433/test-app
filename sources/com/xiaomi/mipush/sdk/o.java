package com.xiaomi.mipush.sdk;

import com.meituan.robust.common.CommonConstant;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class o implements PushMessageHandler.a {
    private static final long serialVersionUID = 1;
    String a;
    int b;
    public String c;
    String d;
    String e;
    String f;
    int g;
    int h;
    int i;
    boolean j;
    String k;
    String l;
    String m;
    boolean n = false;
    HashMap<String, String> o = new HashMap<>();

    public final String toString() {
        return "messageId={" + this.a + "},passThrough={" + this.g + "},alias={" + this.d + "},topic={" + this.e + "},userAccount={" + this.f + "},content={" + this.c + "},description={" + this.k + "},title={" + this.l + "},isNotified={" + this.j + "},notifyId={" + this.i + "},notifyType={" + this.h + "}, category={" + this.m + "}, extra={" + this.o + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }
}
