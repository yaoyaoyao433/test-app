package com.xiaomi.mipush.sdk;

import com.meituan.robust.common.CommonConstant;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import java.util.List;
/* loaded from: classes6.dex */
public final class n implements PushMessageHandler.a {
    private static final long serialVersionUID = 1;
    public String a;
    public long b;
    String c;
    public List<String> d;
    String e;

    public final String toString() {
        return "command={" + this.a + "}, resultCode={" + this.b + "}, reason={" + this.c + "}, category={" + this.e + "}, commandArguments={" + this.d + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }
}
