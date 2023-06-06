package com.dianping.eunomia;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.bridge.BaseJavaModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\rJ*\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0007J5\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\rJ*\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0007J%\u0010\u000f\u001a\u00020\u00112\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001a\u001a\u00020\u0000H\u0007J\b\u0010\u001b\u001a\u0004\u0018\u00010\bJ\"\u0010\u001c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0004H\u0007J\u0012\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\"H\u0007J\u0006\u0010#\u001a\u00020\u0011J&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/dianping/eunomia/ModuleManager;", "", "()V", "ONE_HOUR", "", "getAgentList", "", "Ljava/util/ArrayList;", "", "context", "Landroid/content/Context;", "keys", "", "(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;", "key", "getConfig", "Lcom/dianping/eunomia/ModuleConfigItem;", "", "configCallback", "Lcom/dianping/eunomia/handler/ModuleConfigCallback;", "([Ljava/lang/String;Lcom/dianping/eunomia/handler/ModuleConfigCallback;)V", "getFrameType", "shopView", "shopViewWithBiz", "moduleShopViewHandler", "Lcom/dianping/eunomia/handler/ModuleShopViewHandler;", "getInstance", "getLuKey", "init", "mapiService", "Lcom/dianping/dataservice/mapi/MApiService;", "versionCode", BaseJavaModule.METHOD_TYPE_SYNC, "forceTotal", "", "syncTimer", "transformTemplate", "originalT", "eunomia_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public static final f b = new f();

    @JvmStatic
    @NotNull
    public static final f a() {
        return b;
    }

    @JvmOverloads
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205f9b9c96b2f8f5cb2a34a05b8129fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205f9b9c96b2f8f5cb2a34a05b8129fe");
        } else {
            l.c.a(z, false, com.dianping.dataservice.mapi.c.NORMAL);
        }
    }

    @JvmOverloads
    @NotNull
    public final List<ArrayList<c>> a(@Nullable Context context, @Nullable String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72296a80ae30c220336f1a83b69d21fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72296a80ae30c220336f1a83b69d21fe");
        }
        com.dianping.eunomia.debug.a.a(str);
        return j.b.a(str);
    }

    @Deprecated(message = "Use getConfig(Context, Array<String>) instead")
    @JvmOverloads
    @NotNull
    public final List<ArrayList<String>> a(@Nullable Context context, @Nullable String[] strArr) {
        Object[] objArr = {context, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9efcd3fd16682d5ac202a18e0894fc97", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9efcd3fd16682d5ac202a18e0894fc97");
        }
        com.dianping.eunomia.debug.a.a(strArr != null ? kotlin.collections.b.a(strArr, "&", "", "", -1, "...", null) : null);
        return a(j.b.a(strArr));
    }

    @NotNull
    private List<ArrayList<String>> a(@NotNull List<? extends ArrayList<c>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1974230f41e649c4f80bb22880668edb", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1974230f41e649c4f80bb22880668edb");
        }
        kotlin.jvm.internal.h.b(list, "originalT");
        ArrayList arrayList = new ArrayList();
        try {
            for (ArrayList<c> arrayList2 : list) {
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(arrayList3);
                Iterator<c> it = arrayList2.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    arrayList3.add(next.a);
                    if (!TextUtils.isEmpty(next.a) && next.c != 0) {
                        d dVar = new d();
                        dVar.a = next.a;
                        dVar.c = next.c;
                        dVar.b = next.b;
                        g.a().a(next.a, dVar);
                    }
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return arrayList;
        }
    }
}
