package com.sankuai.xm.ui.service;

import android.content.Context;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.imui.common.panel.plugin.EmotionPlugin;
import com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
    }

    int a(C1420b c1420b);

    int a(@NonNull String str, @NonNull String str2, @IntRange(from = 3, to = 5) int i, String str3, Callback<a> callback);

    View a(@NonNull Context context, ViewGroup viewGroup, EmotionPlugin emotionPlugin);

    String a(@NonNull String str, @Nullable String str2, @IntRange(from = 1, to = 5) int i);

    IExtraViewAdapter b();

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.ui.service.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1420b {
        public static ChangeQuickRedirect a;
        public Collection<String> b;
        public long c;
        public boolean d;

        public C1420b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b010514c9c199cdf6ef722e792ab3d83", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b010514c9c199cdf6ef722e792ab3d83");
                return;
            }
            this.c = 86400000L;
            this.d = false;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32d7ca4877d8b7d45b2f711cba16fc70", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32d7ca4877d8b7d45b2f711cba16fc70");
            }
            return "QueryParams{packageIds=" + this.b + ", mPeriodOfCacheValidity=" + this.c + ", mPreloadIntoCache=" + this.d + '}';
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce59dbb889da55274c0f6967b75d4f58", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce59dbb889da55274c0f6967b75d4f58")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1420b c1420b = (C1420b) obj;
            return this.c == c1420b.c && this.d == c1420b.d && ((com.sankuai.xm.base.util.b.a(this.b) && com.sankuai.xm.base.util.b.a(c1420b.b)) || (this.b.size() == c1420b.b.size() && this.b.containsAll(c1420b.b)));
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7821399a7213b723cb063403d2983bc8", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7821399a7213b723cb063403d2983bc8")).intValue() : Arrays.hashCode(new Object[]{this.b, Long.valueOf(this.c), Boolean.valueOf(this.d)});
        }

        public static C1420b a(Collection<String> collection) {
            Object[] objArr = {collection};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29349387f52aff7bc377090d5914e251", 6917529027641081856L)) {
                return (C1420b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29349387f52aff7bc377090d5914e251");
            }
            C1420b c1420b = new C1420b();
            c1420b.b = collection;
            return c1420b;
        }

        public static C1420b a(Collection<String> collection, long j) {
            Object[] objArr = {collection, 86400000L};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7090e9c752e24ec86f8458763333111c", 6917529027641081856L)) {
                return (C1420b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7090e9c752e24ec86f8458763333111c");
            }
            C1420b a2 = a(collection);
            a2.c = 86400000L;
            return a2;
        }
    }
}
