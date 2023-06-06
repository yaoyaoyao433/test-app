package com.sankuai.waimai.mach.common;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.js.debug.IMachConsole;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class DevSettings {
    public static ChangeQuickRedirect a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public Map<String, LockBundleInfo> j;
    public boolean k;
    private Map<Mach, List<IMachConsole>> l;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LockBundleInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String bundleDir;
        public String env;
        public String templateId;
        public String version;
    }

    private DevSettings(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f78dde5a6dd3a4b7e1b07cdda59f7dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f78dde5a6dd3a4b7e1b07cdda59f7dc");
            return;
        }
        this.l = new WeakHashMap();
        this.j = new HashMap();
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.i;
        this.e = aVar.h;
        this.f = aVar.d;
        this.g = aVar.e;
        this.h = aVar.f;
        this.i = aVar.g;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public boolean b;
        public boolean c;
        public String d;
        public String e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;

        public final DevSettings a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebe7a2362172dc9882326417d71e8f0e", RobustBitConfig.DEFAULT_VALUE) ? (DevSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebe7a2362172dc9882326417d71e8f0e") : new DevSettings(this);
        }
    }

    @NonNull
    public final synchronized List<IMachConsole> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47a8e67b72b45ca14a03b02b9d4ea75d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47a8e67b72b45ca14a03b02b9d4ea75d");
        } else if (this.l.isEmpty()) {
            return Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            for (List<IMachConsole> list : this.l.values()) {
                if (list != null && !list.isEmpty()) {
                    arrayList.addAll(list);
                }
            }
            if (CollectionUtils.isEmpty(arrayList)) {
                return Collections.emptyList();
            }
            return arrayList;
        }
    }

    public final LockBundleInfo a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a06ae05e2d04c6e24dfcb4cd293fc481", RobustBitConfig.DEFAULT_VALUE) ? (LockBundleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a06ae05e2d04c6e24dfcb4cd293fc481") : this.j.get(str);
    }
}
