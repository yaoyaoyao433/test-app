package com.sankuai.ehcore;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.eh.component.service.tools.a;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.ehcore.module.core.e;
import com.sankuai.ehcore.module.core.f;
import com.sankuai.ehcore.module.loader.g;
import com.sankuai.ehcore.module.loader.h;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.ehcore.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0568a {
    }

    public static View a(Activity activity, View view, KNBWebCompat kNBWebCompat, String str) {
        Object[] objArr = {activity, view, kNBWebCompat, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff84ed166d807a0fcabf3eb0dc32a228", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff84ed166d807a0fcabf3eb0dc32a228") : a(activity, view, kNBWebCompat, str, 104, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0136 A[Catch: Exception -> 0x05ea, TryCatch #0 {Exception -> 0x05ea, blocks: (B:12:0x005c, B:14:0x0062, B:18:0x0072, B:20:0x00b0, B:22:0x00b6, B:24:0x00dd, B:40:0x0152, B:42:0x0181, B:43:0x0189, B:45:0x01d7, B:70:0x02a7, B:72:0x02c0, B:97:0x0353, B:98:0x035c, B:100:0x0383, B:157:0x05e7, B:101:0x0389, B:103:0x039d, B:119:0x0463, B:121:0x0476, B:124:0x0484, B:126:0x0497, B:139:0x056a, B:142:0x057a, B:144:0x058b, B:146:0x05ab, B:149:0x05b0, B:151:0x05c6, B:152:0x05cb, B:154:0x05d1, B:156:0x05dd, B:127:0x049d, B:129:0x04c1, B:131:0x04ca, B:133:0x0502, B:135:0x052c, B:137:0x0551, B:138:0x055a, B:134:0x050a, B:130:0x04c6, B:123:0x047c, B:105:0x03a4, B:107:0x03c1, B:109:0x03d1, B:111:0x0402, B:112:0x0405, B:114:0x041f, B:115:0x0423, B:117:0x0437, B:118:0x043d, B:108:0x03c9, B:73:0x02cd, B:75:0x02d3, B:77:0x02d9, B:80:0x02e3, B:82:0x02e9, B:85:0x02f0, B:87:0x02fd, B:89:0x0325, B:90:0x0336, B:92:0x0349, B:94:0x034d, B:46:0x01df, B:48:0x01ef, B:51:0x01f9, B:53:0x0206, B:55:0x0210, B:58:0x0218, B:60:0x021c, B:62:0x0225, B:63:0x0237, B:65:0x023b, B:66:0x023d, B:68:0x024c, B:69:0x0256, B:56:0x0213, B:57:0x0216, B:26:0x00e7, B:28:0x00f4, B:30:0x0102, B:34:0x010b, B:35:0x010d, B:37:0x0136, B:39:0x0150, B:38:0x0141), top: B:170:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141 A[Catch: Exception -> 0x05ea, TryCatch #0 {Exception -> 0x05ea, blocks: (B:12:0x005c, B:14:0x0062, B:18:0x0072, B:20:0x00b0, B:22:0x00b6, B:24:0x00dd, B:40:0x0152, B:42:0x0181, B:43:0x0189, B:45:0x01d7, B:70:0x02a7, B:72:0x02c0, B:97:0x0353, B:98:0x035c, B:100:0x0383, B:157:0x05e7, B:101:0x0389, B:103:0x039d, B:119:0x0463, B:121:0x0476, B:124:0x0484, B:126:0x0497, B:139:0x056a, B:142:0x057a, B:144:0x058b, B:146:0x05ab, B:149:0x05b0, B:151:0x05c6, B:152:0x05cb, B:154:0x05d1, B:156:0x05dd, B:127:0x049d, B:129:0x04c1, B:131:0x04ca, B:133:0x0502, B:135:0x052c, B:137:0x0551, B:138:0x055a, B:134:0x050a, B:130:0x04c6, B:123:0x047c, B:105:0x03a4, B:107:0x03c1, B:109:0x03d1, B:111:0x0402, B:112:0x0405, B:114:0x041f, B:115:0x0423, B:117:0x0437, B:118:0x043d, B:108:0x03c9, B:73:0x02cd, B:75:0x02d3, B:77:0x02d9, B:80:0x02e3, B:82:0x02e9, B:85:0x02f0, B:87:0x02fd, B:89:0x0325, B:90:0x0336, B:92:0x0349, B:94:0x034d, B:46:0x01df, B:48:0x01ef, B:51:0x01f9, B:53:0x0206, B:55:0x0210, B:58:0x0218, B:60:0x021c, B:62:0x0225, B:63:0x0237, B:65:0x023b, B:66:0x023d, B:68:0x024c, B:69:0x0256, B:56:0x0213, B:57:0x0216, B:26:0x00e7, B:28:0x00f4, B:30:0x0102, B:34:0x010b, B:35:0x010d, B:37:0x0136, B:39:0x0150, B:38:0x0141), top: B:170:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0181 A[Catch: Exception -> 0x05ea, TryCatch #0 {Exception -> 0x05ea, blocks: (B:12:0x005c, B:14:0x0062, B:18:0x0072, B:20:0x00b0, B:22:0x00b6, B:24:0x00dd, B:40:0x0152, B:42:0x0181, B:43:0x0189, B:45:0x01d7, B:70:0x02a7, B:72:0x02c0, B:97:0x0353, B:98:0x035c, B:100:0x0383, B:157:0x05e7, B:101:0x0389, B:103:0x039d, B:119:0x0463, B:121:0x0476, B:124:0x0484, B:126:0x0497, B:139:0x056a, B:142:0x057a, B:144:0x058b, B:146:0x05ab, B:149:0x05b0, B:151:0x05c6, B:152:0x05cb, B:154:0x05d1, B:156:0x05dd, B:127:0x049d, B:129:0x04c1, B:131:0x04ca, B:133:0x0502, B:135:0x052c, B:137:0x0551, B:138:0x055a, B:134:0x050a, B:130:0x04c6, B:123:0x047c, B:105:0x03a4, B:107:0x03c1, B:109:0x03d1, B:111:0x0402, B:112:0x0405, B:114:0x041f, B:115:0x0423, B:117:0x0437, B:118:0x043d, B:108:0x03c9, B:73:0x02cd, B:75:0x02d3, B:77:0x02d9, B:80:0x02e3, B:82:0x02e9, B:85:0x02f0, B:87:0x02fd, B:89:0x0325, B:90:0x0336, B:92:0x0349, B:94:0x034d, B:46:0x01df, B:48:0x01ef, B:51:0x01f9, B:53:0x0206, B:55:0x0210, B:58:0x0218, B:60:0x021c, B:62:0x0225, B:63:0x0237, B:65:0x023b, B:66:0x023d, B:68:0x024c, B:69:0x0256, B:56:0x0213, B:57:0x0216, B:26:0x00e7, B:28:0x00f4, B:30:0x0102, B:34:0x010b, B:35:0x010d, B:37:0x0136, B:39:0x0150, B:38:0x0141), top: B:170:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0189 A[Catch: Exception -> 0x05ea, TryCatch #0 {Exception -> 0x05ea, blocks: (B:12:0x005c, B:14:0x0062, B:18:0x0072, B:20:0x00b0, B:22:0x00b6, B:24:0x00dd, B:40:0x0152, B:42:0x0181, B:43:0x0189, B:45:0x01d7, B:70:0x02a7, B:72:0x02c0, B:97:0x0353, B:98:0x035c, B:100:0x0383, B:157:0x05e7, B:101:0x0389, B:103:0x039d, B:119:0x0463, B:121:0x0476, B:124:0x0484, B:126:0x0497, B:139:0x056a, B:142:0x057a, B:144:0x058b, B:146:0x05ab, B:149:0x05b0, B:151:0x05c6, B:152:0x05cb, B:154:0x05d1, B:156:0x05dd, B:127:0x049d, B:129:0x04c1, B:131:0x04ca, B:133:0x0502, B:135:0x052c, B:137:0x0551, B:138:0x055a, B:134:0x050a, B:130:0x04c6, B:123:0x047c, B:105:0x03a4, B:107:0x03c1, B:109:0x03d1, B:111:0x0402, B:112:0x0405, B:114:0x041f, B:115:0x0423, B:117:0x0437, B:118:0x043d, B:108:0x03c9, B:73:0x02cd, B:75:0x02d3, B:77:0x02d9, B:80:0x02e3, B:82:0x02e9, B:85:0x02f0, B:87:0x02fd, B:89:0x0325, B:90:0x0336, B:92:0x0349, B:94:0x034d, B:46:0x01df, B:48:0x01ef, B:51:0x01f9, B:53:0x0206, B:55:0x0210, B:58:0x0218, B:60:0x021c, B:62:0x0225, B:63:0x0237, B:65:0x023b, B:66:0x023d, B:68:0x024c, B:69:0x0256, B:56:0x0213, B:57:0x0216, B:26:0x00e7, B:28:0x00f4, B:30:0x0102, B:34:0x010b, B:35:0x010d, B:37:0x0136, B:39:0x0150, B:38:0x0141), top: B:170:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023b A[Catch: Exception -> 0x05ea, TryCatch #0 {Exception -> 0x05ea, blocks: (B:12:0x005c, B:14:0x0062, B:18:0x0072, B:20:0x00b0, B:22:0x00b6, B:24:0x00dd, B:40:0x0152, B:42:0x0181, B:43:0x0189, B:45:0x01d7, B:70:0x02a7, B:72:0x02c0, B:97:0x0353, B:98:0x035c, B:100:0x0383, B:157:0x05e7, B:101:0x0389, B:103:0x039d, B:119:0x0463, B:121:0x0476, B:124:0x0484, B:126:0x0497, B:139:0x056a, B:142:0x057a, B:144:0x058b, B:146:0x05ab, B:149:0x05b0, B:151:0x05c6, B:152:0x05cb, B:154:0x05d1, B:156:0x05dd, B:127:0x049d, B:129:0x04c1, B:131:0x04ca, B:133:0x0502, B:135:0x052c, B:137:0x0551, B:138:0x055a, B:134:0x050a, B:130:0x04c6, B:123:0x047c, B:105:0x03a4, B:107:0x03c1, B:109:0x03d1, B:111:0x0402, B:112:0x0405, B:114:0x041f, B:115:0x0423, B:117:0x0437, B:118:0x043d, B:108:0x03c9, B:73:0x02cd, B:75:0x02d3, B:77:0x02d9, B:80:0x02e3, B:82:0x02e9, B:85:0x02f0, B:87:0x02fd, B:89:0x0325, B:90:0x0336, B:92:0x0349, B:94:0x034d, B:46:0x01df, B:48:0x01ef, B:51:0x01f9, B:53:0x0206, B:55:0x0210, B:58:0x0218, B:60:0x021c, B:62:0x0225, B:63:0x0237, B:65:0x023b, B:66:0x023d, B:68:0x024c, B:69:0x0256, B:56:0x0213, B:57:0x0216, B:26:0x00e7, B:28:0x00f4, B:30:0x0102, B:34:0x010b, B:35:0x010d, B:37:0x0136, B:39:0x0150, B:38:0x0141), top: B:170:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024c A[Catch: Exception -> 0x05ea, TryCatch #0 {Exception -> 0x05ea, blocks: (B:12:0x005c, B:14:0x0062, B:18:0x0072, B:20:0x00b0, B:22:0x00b6, B:24:0x00dd, B:40:0x0152, B:42:0x0181, B:43:0x0189, B:45:0x01d7, B:70:0x02a7, B:72:0x02c0, B:97:0x0353, B:98:0x035c, B:100:0x0383, B:157:0x05e7, B:101:0x0389, B:103:0x039d, B:119:0x0463, B:121:0x0476, B:124:0x0484, B:126:0x0497, B:139:0x056a, B:142:0x057a, B:144:0x058b, B:146:0x05ab, B:149:0x05b0, B:151:0x05c6, B:152:0x05cb, B:154:0x05d1, B:156:0x05dd, B:127:0x049d, B:129:0x04c1, B:131:0x04ca, B:133:0x0502, B:135:0x052c, B:137:0x0551, B:138:0x055a, B:134:0x050a, B:130:0x04c6, B:123:0x047c, B:105:0x03a4, B:107:0x03c1, B:109:0x03d1, B:111:0x0402, B:112:0x0405, B:114:0x041f, B:115:0x0423, B:117:0x0437, B:118:0x043d, B:108:0x03c9, B:73:0x02cd, B:75:0x02d3, B:77:0x02d9, B:80:0x02e3, B:82:0x02e9, B:85:0x02f0, B:87:0x02fd, B:89:0x0325, B:90:0x0336, B:92:0x0349, B:94:0x034d, B:46:0x01df, B:48:0x01ef, B:51:0x01f9, B:53:0x0206, B:55:0x0210, B:58:0x0218, B:60:0x021c, B:62:0x0225, B:63:0x0237, B:65:0x023b, B:66:0x023d, B:68:0x024c, B:69:0x0256, B:56:0x0213, B:57:0x0216, B:26:0x00e7, B:28:0x00f4, B:30:0x0102, B:34:0x010b, B:35:0x010d, B:37:0x0136, B:39:0x0150, B:38:0x0141), top: B:170:0x005c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.view.View a(android.app.Activity r32, android.view.View r33, com.sankuai.meituan.android.knb.KNBWebCompat r34, java.lang.String r35, int r36, com.sankuai.ehcore.a.InterfaceC0568a r37) {
        /*
            Method dump skipped, instructions count: 1583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.ehcore.a.a(android.app.Activity, android.view.View, com.sankuai.meituan.android.knb.KNBWebCompat, java.lang.String, int, com.sankuai.ehcore.a$a):android.view.View");
    }

    @Deprecated
    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5b39bdc61b2497d6924dd1db68fe769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5b39bdc61b2497d6924dd1db68fe769");
            return;
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4763faefe4652a7790d526921045c762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4763faefe4652a7790d526921045c762");
            return;
        }
        try {
            com.sankuai.ehcore.module.core.a a2 = f.a(activity);
            if (a2 == null || a2.e().c("pageFinish") != null) {
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.ehcore.module.core.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d7d983bf1cd556373242a548657b4398", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d7d983bf1cd556373242a548657b4398");
                return;
            }
            if (!a2.h.e) {
                com.sankuai.ehcore.module.loader.a.a().a(a2.h.i, a2.h.a().get(PackageLoadReporter.Source.PREFETCH), 2);
            }
            a2.h.e = true;
            if (a2.h.n) {
                d.b("支持autoshow");
                a2.a(false);
            }
        } catch (Exception e) {
            d.a(e);
        }
    }

    public static void a(Activity activity, KNBWebCompat kNBWebCompat) {
        boolean z;
        Object[] objArr = {activity, kNBWebCompat};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bf2c3203e06143cc98c586a086128b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bf2c3203e06143cc98c586a086128b7");
            return;
        }
        com.sankuai.ehcore.module.core.a a2 = f.a(activity);
        if (a2 == null || a2.e().c("pageStart") != null) {
            return;
        }
        a2.e().a("pageStart", Boolean.TRUE);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.ehcore.module.core.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "08c9d0b329e2853aa193a70dc87873cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "08c9d0b329e2853aa193a70dc87873cc");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.ehcore.module.core.a.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "8523856de206d12395d1c950392228a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "8523856de206d12395d1c950392228a0");
        } else {
            com.sankuai.eh.component.service.tools.a aVar = a.C0548a.a;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.eh.component.service.tools.a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "9e8f0e18bd541b69140d7540495714d4", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "9e8f0e18bd541b69140d7540495714d4")).booleanValue();
            } else {
                z = aVar.b || com.sankuai.eh.component.service.utils.f.b();
            }
            if (z && a2.e != null) {
                new Handler().postDelayed(e.a(a2), 500L);
            }
        }
        if (a2.k != null) {
            g gVar = a2.k;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = g.a;
            if (PatchProxy.isSupport(objArr5, gVar, changeQuickRedirect5, false, "22eb4301fdf95f19a9be522cdaf3b558", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, gVar, changeQuickRedirect5, false, "22eb4301fdf95f19a9be522cdaf3b558");
            } else if (gVar.d && com.sankuai.eh.component.service.utils.f.a(gVar.a())) {
                WebView webView = gVar.b.e;
                Object[] objArr6 = {webView};
                ChangeQuickRedirect changeQuickRedirect6 = g.a;
                if (PatchProxy.isSupport(objArr6, gVar, changeQuickRedirect6, false, "639d6973f7937fe2baad39e53de330c2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, gVar, changeQuickRedirect6, false, "639d6973f7937fe2baad39e53de330c2");
                    return;
                }
                gVar.c = c.c("eh-autoshow").scheduleAtFixedRate(h.a(gVar, System.currentTimeMillis(), com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(gVar.a(), "timeout"), 2000), webView), 0L, com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(gVar.a(), "period"), 100), TimeUnit.MILLISECONDS);
            }
        }
    }

    public static void a(com.sankuai.ehcore.module.core.a aVar) {
        boolean z = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd149e1853b97d46f115daa1fc4560f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd149e1853b97d46f115daa1fc4560f0");
            return;
        }
        d.b("Activity 销毁，正在调用 EHCore.release");
        if (aVar != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.ehcore.module.core.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9e41b296c51694c30ee73cdf92369afd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9e41b296c51694c30ee73cdf92369afd");
            } else {
                if (aVar.c() == 0) {
                    d.b a2 = new d.b().a("name", "eh.page.close").a("currentUrl", aVar.h.m);
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.ehcore.module.core.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "80aa063fe49bcf2b9ef4cdbc20e1b984", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "80aa063fe49bcf2b9ef4cdbc20e1b984")).booleanValue();
                    } else if (!aVar.h.f && (!aVar.h.n || !aVar.h.e)) {
                        z = false;
                    }
                    aVar.a("eh_close", a2.a("ehShow", Boolean.valueOf(z)).a("load", Boolean.valueOf(aVar.h.e)).a("click", com.sankuai.eh.plugins.skeleton.util.b.a(aVar.h.c("clickEvents"))).b, Long.valueOf(aVar.h.b("at_eh_open")));
                }
                com.sankuai.eh.component.service.tools.b.a().d = com.sankuai.ehcore.util.a.a(aVar.h);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.ehcore.module.core.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "dfd2f5728e51ed6226f7245ee01d7019", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "dfd2f5728e51ed6226f7245ee01d7019");
                } else {
                    String a3 = com.sankuai.eh.component.service.utils.e.a(aVar.h.k);
                    if (aVar.c && com.sankuai.ehcore.horn.e.a(1003) && !com.sankuai.eh.plugins.skeleton.a.b(aVar.i)) {
                        com.dianping.codelog.b.b(com.sankuai.ehcore.module.core.a.class, "android skeleton degrade", a3);
                        d.a("autoDegrade", "android skeleton degrade");
                    }
                }
                aVar.d().b();
                g gVar = aVar.k;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = g.a;
                if (PatchProxy.isSupport(objArr5, gVar, changeQuickRedirect5, false, "5a35f7a7aaa07a61f64e13547e4c3f5e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, gVar, changeQuickRedirect5, false, "5a35f7a7aaa07a61f64e13547e4c3f5e");
                } else if (gVar.c != null) {
                    gVar.c.cancel(false);
                }
            }
            f.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        int a;
        boolean b;

        public b() {
        }
    }
}
