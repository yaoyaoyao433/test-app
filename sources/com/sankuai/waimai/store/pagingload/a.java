package com.sankuai.waimai.store.pagingload;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.pagingload.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1262a<Src, Desc> {
        Desc a(@NonNull Src src);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class b<Src, Desc> {
        public static ChangeQuickRedirect e;

        public void a() {
        }

        public void a(int i, @Nullable Throwable th, List<Desc> list) {
        }

        public void a(List<Desc> list, int i) {
        }

        public void b() {
        }

        public void b(List<Src> list, int i) {
            Object[] objArr = {list, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a6a1711254eebc66519346b7bfde736", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a6a1711254eebc66519346b7bfde736");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c<Src> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface d<Src, Desc> {
        Desc a(@NonNull Src src);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface e<Src> {
        boolean a(Src src);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface f<Src> {
        boolean a(Src src);
    }
}
