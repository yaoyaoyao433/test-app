package com.sankuai.waimai.store.widgets.twolevel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    private String d;

    public b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d8af6495ec5a6c51d1b538d6d78d21b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d8af6495ec5a6c51d1b538d6d78d21b");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public void a(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22fe06b103f09600267a38f45ee29ad1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22fe06b103f09600267a38f45ee29ad1");
            return;
        }
        try {
            JudasManualManager.b(str, str2, str3).a(map).a();
        } catch (Throwable unused) {
        }
    }

    public void b(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2817ef86e04d2a8954330136bfe2acb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2817ef86e04d2a8954330136bfe2acb0");
            return;
        }
        try {
            JudasManualManager.a(str, str2, str3).a(map).a();
        } catch (Throwable unused) {
        }
    }

    public Map<String, Object> a(@NotNull PoiVerticalityDataResponse.SecondFloor secondFloor) {
        Object[] objArr = {secondFloor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e43e80d1ad6638a74f5584aeba88f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e43e80d1ad6638a74f5584aeba88f2");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("stid", a(this.d));
        hashMap.put("activity_id", a(String.valueOf(secondFloor.activityId)));
        hashMap.put("activity_urlkey", a(secondFloor.activityUrl));
        hashMap.put("pic_url", a(secondFloor.activityPic));
        return hashMap;
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c28a393909fe07d4f83e91863e8566b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c28a393909fe07d4f83e91863e8566b") : t.a(str) ? "-999" : str;
    }
}
