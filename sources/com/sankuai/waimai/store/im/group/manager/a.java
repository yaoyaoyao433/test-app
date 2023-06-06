package com.sankuai.waimai.store.im.group.manager;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.im.group.model.SGGroupBriefInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static int b = 0;
    public static int c = 1;
    public static int d = -1;
    public SharedPreferences e;
    public List<SGGroupBriefInfo.GroupBriefInfo> f;
    private SharedPreferences.Editor g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd8ae1185bf31b386184b0d184062cbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd8ae1185bf31b386184b0d184062cbb");
            return;
        }
        this.f = new ArrayList();
        this.e = com.meituan.android.singleton.b.a.getSharedPreferences("sg_group_im", 0);
        this.g = this.e.edit();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.im.group.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1210a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd7acda9443c99e869040097846438da", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd7acda9443c99e869040097846438da") : C1210a.a;
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "329a055b3681600ff2296a7b8d769d13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "329a055b3681600ff2296a7b8d769d13");
        } else {
            this.g.putInt(str, z ? c : b).commit();
        }
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b27a37ac03421ab16d42ba6852354cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b27a37ac03421ab16d42ba6852354cdd");
        } else if (t.a(str)) {
        } else {
            this.g.putInt(str + "AtMe", i).commit();
        }
    }

    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68e478bd291d3beff5c6a544f21a30c1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68e478bd291d3beff5c6a544f21a30c1")).intValue() : this.e.getInt(str, d);
    }

    public final SGGroupBriefInfo.GroupBriefInfo b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f7977706fc3b006c064d0acc36f125a", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGGroupBriefInfo.GroupBriefInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f7977706fc3b006c064d0acc36f125a");
        }
        for (int i = 0; i < this.f.size(); i++) {
            SGGroupBriefInfo.GroupBriefInfo groupBriefInfo = this.f.get(i);
            if (groupBriefInfo != null && TextUtils.equals(groupBriefInfo.groupId, str)) {
                return groupBriefInfo;
            }
        }
        return null;
    }
}
