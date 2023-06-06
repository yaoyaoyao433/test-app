package com.sankuai.xm.imui.common.report;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.panel.plugin.CameraPlugin;
import com.sankuai.xm.imui.common.panel.plugin.EmotionPlugin;
import com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin;
import com.sankuai.xm.imui.common.panel.plugin.FilePlugin;
import com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin;
import com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
import com.sankuai.xm.imui.common.panel.plugin.SendPlugin;
import com.sankuai.xm.imui.common.panel.plugin.VideoPlugin;
import com.sankuai.xm.imui.common.panel.plugin.VoicePlugin;
import com.sankuai.xm.monitor.c;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<Class<? extends Plugin>, Integer> b;

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ab61d97575bfc34f21460e0ca54f442", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ab61d97575bfc34f21460e0ca54f442")).intValue();
        }
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
            default:
                return -1;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(ExtraPlugin.class, 0);
        b.put(VoicePlugin.class, 1);
        b.put(InputEditorPlugin.class, 2);
        b.put(EmotionPlugin.class, 3);
        b.put(SendPlugin.class, 4);
        b.put(CameraPlugin.class, 6);
        b.put(FilePlugin.class, 7);
        b.put(PhotoPlugin.class, 11);
        b.put(VideoPlugin.class, 12);
    }

    public static void b(int i) {
        Object[] objArr = {101};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c0316ad14699c191e38f2542c74a728", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c0316ad14699c191e38f2542c74a728");
        } else {
            a(101, "");
        }
    }

    public static void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9a15650519bdc009074e8f5b9b7eb96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9a15650519bdc009074e8f5b9b7eb96");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", 1);
        hashMap.put("id", Integer.valueOf(i));
        if (i == 16 || i == -1) {
            hashMap.put("name", str);
        }
        c.a("session_click", hashMap);
    }

    public static void c(int i) {
        Object[] objArr = {14};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42b5e5b14e9bd94e3fc40639c162570f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42b5e5b14e9bd94e3fc40639c162570f");
            return;
        }
        Object[] objArr2 = {14, ""};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "31e4bbc7d51398a2993662260284cfc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "31e4bbc7d51398a2993662260284cfc7");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", 2);
        hashMap.put("id", 14);
        c.a("session_click", hashMap);
    }

    public static void a(Class<? extends Plugin> cls) {
        int intValue;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f2f72d60715e16a886207a824b89305", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f2f72d60715e16a886207a824b89305");
            return;
        }
        Object[] objArr2 = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "05503988700c20bfc89c14857bce4901", 6917529027641081856L)) {
            intValue = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "05503988700c20bfc89c14857bce4901")).intValue();
        } else {
            Integer num = b.get(cls);
            if (num == null) {
                num = 13;
            }
            intValue = num.intValue();
        }
        String name = cls.getName();
        HashMap hashMap = new HashMap();
        hashMap.put("type", 2);
        hashMap.put("id", Integer.valueOf(intValue));
        if (intValue == 13 || intValue == -1) {
            hashMap.put("name", name);
        }
        c.a("session_click", hashMap);
    }
}
