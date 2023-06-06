package com.sankuai.waimai.store.msc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.j;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.config.k;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8e4379fe92c6d16b3122efb6256027f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8e4379fe92c6d16b3122efb6256027f");
        }
        String a2 = a("/pages/store/index");
        if (k.d()) {
            return t.a(a2) ? "imeituan://www.meituan.com/msc?appId=7122f6e193de47c1&pushStyle=1&targetPath=%2Fpages%2Fstore%2Findex%3FisSg%3D1" : a2;
        } else if (k.c()) {
            if (!t.a(a2)) {
                a2 = a2.replace("imeituan://www.meituan.com/msc", "meituanwaimai://waimai.meituan.com/msc");
            }
            return t.a(a2) ? "meituanwaimai://waimai.meituan.com/msc?appId=7122f6e193de47c1&pushStyle=1&targetPath=%2Fpages%2Fstore%2Findex%3FisSg%3D1" : a2;
        } else if (k.e()) {
            if (!t.a(a2)) {
                a2 = a2.replace("imeituan://www.meituan.com/msc", "dianping://msc");
            }
            return t.a(a2) ? "dianping://msc?appId=7122f6e193de47c1&pushStyle=1&targetPath=%2Fpages%2Fstore%2Findex%3FisSg%3D1" : a2;
        } else {
            return "";
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fcc27aaf2d3bc352410c781933c10cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fcc27aaf2d3bc352410c781933c10cd");
        }
        String a2 = j.a(new File("/sdcard/meituan/sg_msc_config.json"));
        if (t.a(a2)) {
            return null;
        }
        try {
            return new JSONObject(a2).optString(str, null);
        } catch (JSONException unused) {
            return null;
        }
    }
}
