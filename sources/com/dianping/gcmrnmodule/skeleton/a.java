package com.dianping.gcmrnmodule.skeleton;

import android.content.Context;
import android.view.View;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bJ\u001c\u0010\u0010\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/dianping/gcmrnmodule/skeleton/MRNModuleSkeletonViewReusePool;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "repos", "Ljava/util/HashMap;", "", "Lcom/dianping/gcmrnmodule/skeleton/MRNModuleSkeletonViewReuseRepo;", "Lkotlin/collections/HashMap;", "dequeueReusableView", "Landroid/view/View;", "identifier", "enqueueReusableView", "", Constants.EventType.VIEW, "registerSkeletonData", "data", "registerSkeletonInfo", "skeletonInfo", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final HashMap<String, b> b;
    public final Context c;

    public a(@NotNull Context context) {
        h.b(context, "context");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15a08c6acf666932d3ff6d70062ff227", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15a08c6acf666932d3ff6d70062ff227");
            return;
        }
        this.c = context;
        this.b = new HashMap<>();
    }

    public final void a(@Nullable String str, @Nullable View view) {
        b bVar;
        ArrayList<View> arrayList;
        boolean z = false;
        Object[] objArr = {str, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd0d2bee3bdccf268ec5cd6f0a756e85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd0d2bee3bdccf268ec5cd6f0a756e85");
            return;
        }
        String str2 = str;
        if (((str2 == null || str2.length() == 0) ? true : true) || view == null || (bVar = this.b.get(str)) == null || (arrayList = bVar.c) == null) {
            return;
        }
        arrayList.add(view);
    }
}
