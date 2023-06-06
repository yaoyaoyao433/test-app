package com.sankuai.waimai.platform.utils.cache;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.l;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b<T> extends com.sankuai.waimai.platform.utils.cache.a<T> {
    public static ChangeQuickRedirect c;
    @NonNull
    final Class<T> d;
    @NonNull
    final String e;

    @NonNull
    public abstract T a();

    public b(@NonNull Class<T> cls, @NonNull String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02da2db10eb41e27c6e1459aac7c76a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02da2db10eb41e27c6e1459aac7c76a0");
            return;
        }
        this.d = cls;
        this.e = str;
    }

    @Override // com.sankuai.waimai.platform.utils.cache.a
    @NonNull
    public final com.sankuai.waimai.platform.utils.cache.interfaces.c<T> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "896e694522d903ef1969eaecdedf1811", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.platform.utils.cache.interfaces.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "896e694522d903ef1969eaecdedf1811") : new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements com.sankuai.waimai.platform.utils.cache.interfaces.c<T> {
        public static ChangeQuickRedirect a;
        @NonNull
        private final String c;
        private boolean d;
        private boolean e;

        private a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b6714e9d6b5b86bc23a73dbbad32e0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b6714e9d6b5b86bc23a73dbbad32e0");
                return;
            }
            this.c = toString();
            this.d = false;
            this.e = false;
        }

        @Override // com.sankuai.waimai.platform.utils.cache.interfaces.a
        public final void a(final T t, final com.sankuai.waimai.platform.utils.cache.interfaces.b<Boolean> bVar) {
            Object[] objArr = {t, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "530268132d3a846fb3062e77a748aa2b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "530268132d3a846fb3062e77a748aa2b");
            } else {
                l.a(new l.c<String>() { // from class: com.sankuai.waimai.platform.utils.cache.b.a.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.sankuai.waimai.platform.utils.l.c
                    public final /* synthetic */ String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8681f138a43739007d4c8a7902d368f1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8681f138a43739007d4c8a7902d368f1") : a.this.a((a) t);
                    }

                    @Override // com.sankuai.waimai.platform.utils.l.c
                    public final /* synthetic */ void a(String str) {
                        boolean z;
                        String str2 = str;
                        Object[] objArr2 = {str2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2916d144f4d03ec92aaaab342f835541", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2916d144f4d03ec92aaaab342f835541");
                            return;
                        }
                        a aVar = a.this;
                        Object[] objArr3 = {str2};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "12eb5fb16a42ab34c457842296861b1d", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "12eb5fb16a42ab34c457842296861b1d")).booleanValue();
                        } else if (TextUtils.isEmpty(str2)) {
                            z = false;
                        } else {
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, b.this.e, str2);
                            z = true;
                        }
                        com.sankuai.waimai.platform.utils.cache.interfaces.b bVar2 = bVar;
                        Object[] objArr4 = {bVar2, Boolean.valueOf(z)};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.utils.cache.a.b;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "5a8eabf73f05292b6fa14bac09385bfd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "5a8eabf73f05292b6fa14bac09385bfd");
                        } else if (bVar2 != null) {
                        }
                    }
                }, this.c);
            }
        }

        @Override // com.sankuai.waimai.platform.utils.cache.interfaces.a
        public final void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1359fda8d76d7a672f0c390b4757dc7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1359fda8d76d7a672f0c390b4757dc7");
            } else {
                l.cancel(this.c);
            }
        }

        @Override // com.sankuai.waimai.platform.utils.cache.interfaces.d
        public final T c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c47a81857d84ec4dd41c7e186d29f481", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c47a81857d84ec4dd41c7e186d29f481");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return (T) a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e120c69ac90094a55ec075c12c8d81d8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e120c69ac90094a55ec075c12c8d81d8") : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, b.this.e, (String) null));
        }

        @NonNull
        private T a(@Nullable String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9adac5fefd4f49c8b769e85d62605e17", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9adac5fefd4f49c8b769e85d62605e17");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    T t = (T) new Gson().fromJson(str, (Class<Object>) b.this.d);
                    if (t != null) {
                        return t;
                    }
                } catch (Exception unused) {
                }
            }
            return (T) b.this.a();
        }

        @Nullable
        String a(@NonNull T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "098cc21da2143206d60c3f7ce1dd0ddc", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "098cc21da2143206d60c3f7ce1dd0ddc");
            }
            try {
                return new Gson().toJson(t);
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
