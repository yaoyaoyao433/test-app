package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.DexLoader;
/* loaded from: classes6.dex */
public class t {
    private DexLoader a;

    public t(DexLoader dexLoader) {
        this.a = null;
        this.a = dexLoader;
    }

    public String a(Context context) {
        Object newInstance;
        Object invokeMethod;
        return (this.a == null || (newInstance = this.a.newInstance("com.tencent.tbs.utils.TbsVideoUtilsProxy", new Class[0], new Object[0])) == null || (invokeMethod = this.a.invokeMethod(newInstance, "com.tencent.tbs.utils.TbsVideoUtilsProxy", "getCurWDPDecodeType", new Class[]{Context.class}, context)) == null) ? "" : String.valueOf(invokeMethod);
    }

    public void a(Context context, String str) {
        Object newInstance;
        if (this.a == null || (newInstance = this.a.newInstance("com.tencent.tbs.utils.TbsVideoUtilsProxy", new Class[0], new Object[0])) == null) {
            return;
        }
        this.a.invokeMethod(newInstance, "com.tencent.tbs.utils.TbsVideoUtilsProxy", "deleteVideoCache", new Class[]{Context.class, String.class}, context, str);
    }
}
