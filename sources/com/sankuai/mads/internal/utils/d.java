package com.sankuai.mads.internal.utils;

import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/sankuai/mads/internal/utils/SPUtils;", "", "()V", "<set-?>", "", "lastEvent", "getLastEvent", "()I", "setLastEvent", "(I)V", "lastEvent$delegate", "Lkotlin/properties/ReadWriteProperty;", "lastNotUpload", "getLastNotUpload", "setLastNotUpload", "lastNotUpload$delegate", "lastQueueLength", "getLastQueueLength", "setLastQueueLength", "lastQueueLength$delegate", "preferences", "Lcom/meituan/android/cipstorage/CIPStorageCenter;", "getPreferences", "()Lcom/meituan/android/cipstorage/CIPStorageCenter;", "preferences$delegate", "Lkotlin/Lazy;", "SharedPreferenceDelegates", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ i[] b = {u.a(new s(u.a(d.class), "preferences", "getPreferences()Lcom/meituan/android/cipstorage/CIPStorageCenter;")), u.a(new m(u.a(d.class), "lastNotUpload", "getLastNotUpload()I")), u.a(new m(u.a(d.class), "lastEvent", "getLastEvent()I")), u.a(new m(u.a(d.class), "lastQueueLength", "getLastQueueLength()I"))};
    public static final d f = new d();
    private static final kotlin.d g = e.a(b.b);
    @NotNull
    public static final kotlin.properties.c c = a.a(a.b, 0, 1, null);
    @NotNull
    public static final kotlin.properties.c d = a.a(a.b, 0, 1, null);
    @NotNull
    public static final kotlin.properties.c e = a.a(a.b, 0, 1, null);

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e829373ffa1d99eb33d70f96c7e9ed3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e829373ffa1d99eb33d70f96c7e9ed3");
        } else {
            c.setValue(this, b[1], Integer.valueOf(i));
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "257943a08effdbc64b4d3baa7ab8722f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "257943a08effdbc64b4d3baa7ab8722f");
        } else {
            d.setValue(this, b[2], Integer.valueOf(i));
        }
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17698ce507739157e8fd61798b5f67eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17698ce507739157e8fd61798b5f67eb");
        } else {
            e.setValue(this, b[3], Integer.valueOf(i));
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/meituan/android/cipstorage/CIPStorageCenter;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<q> {
        public static ChangeQuickRedirect a;
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ q invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24768e86476abfd87555db6aa821ce3f", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24768e86476abfd87555db6aa821ce3f") : q.a(com.sankuai.mads.internal.c.l.a(), "sp_mads");
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0002\u0010\u0007\u001a\u00020\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0002\u0010\u0007\u001a\u00020\rJ,\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fJ \u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0010¨\u0006\u0012"}, d2 = {"Lcom/sankuai/mads/internal/utils/SPUtils$SharedPreferenceDelegates;", "", "()V", Constants.BOOLEAN, "Lkotlin/properties/ReadWriteProperty;", "Lcom/sankuai/mads/internal/utils/SPUtils;", "", "defaultValue", "float", "", "int", "", Constants.LONG, "", "setString", "", "", "string", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    static final class a {
        public static ChangeQuickRedirect a;
        public static final a b = new a();

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0096\u0002¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0096\u0002¨\u0006\f"}, d2 = {"com/sankuai/mads/internal/utils/SPUtils$SharedPreferenceDelegates$int$1", "Lkotlin/properties/ReadWriteProperty;", "Lcom/sankuai/mads/internal/utils/SPUtils;", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Lcom/sankuai/mads/internal/utils/SPUtils;Lkotlin/reflect/KProperty;)Ljava/lang/Integer;", "setValue", "", "value", "sdk_release"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.sankuai.mads.internal.utils.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0581a implements kotlin.properties.c<d, Integer> {
            public static ChangeQuickRedirect a;
            public final /* synthetic */ int b;

            public C0581a(int i) {
                this.b = i;
            }

            @Override // kotlin.properties.c
            public final /* synthetic */ Integer getValue(d dVar, i iVar) {
                d dVar2 = dVar;
                Object[] objArr = {dVar2, iVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e85aba22daf7bc99e39c37cc7bf7621", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e85aba22daf7bc99e39c37cc7bf7621");
                }
                h.b(dVar2, "thisRef");
                h.b(iVar, "property");
                return Integer.valueOf(d.a(dVar2).b(iVar.getName(), this.b));
            }

            @Override // kotlin.properties.c
            public final /* synthetic */ void setValue(d dVar, i iVar, Integer num) {
                d dVar2 = dVar;
                int intValue = num.intValue();
                Object[] objArr = {dVar2, iVar, Integer.valueOf(intValue)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc1d2352f416c9617db5a20e0b877a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc1d2352f416c9617db5a20e0b877a4");
                    return;
                }
                h.b(dVar2, "thisRef");
                h.b(iVar, "property");
                if (this.b == intValue) {
                    d.a(dVar2).b(iVar.getName());
                } else {
                    d.a(dVar2).a(iVar.getName(), intValue);
                }
            }
        }

        public static /* synthetic */ kotlin.properties.c a(a aVar, int i, int i2, Object obj) {
            Object[] objArr = {0};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "2b3f50e2d9b22fa84adb6acac5f6bab5", RobustBitConfig.DEFAULT_VALUE) ? (kotlin.properties.c) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "2b3f50e2d9b22fa84adb6acac5f6bab5") : new C0581a(0);
        }
    }

    public static final /* synthetic */ q a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "e6c5641edab394ed7156e31e2451ffc0", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "e6c5641edab394ed7156e31e2451ffc0") : (q) g.a();
    }
}
