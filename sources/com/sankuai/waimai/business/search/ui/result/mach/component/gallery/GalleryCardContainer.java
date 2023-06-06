package com.sankuai.waimai.business.search.ui.result.mach.component.gallery;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.GalleryCardLayoutManager;
import com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.SpeedRecyclerView;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GalleryCardContainer extends MachViewGroup {
    public static ChangeQuickRedirect a = null;
    static final String b = "GalleryCardContainer";
    RecyclerView c;
    com.sankuai.waimai.business.search.ui.result.mach.component.gallery.a d;
    c e;
    com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a f;
    GalleryCardLayoutManager g;
    List<com.sankuai.waimai.mach.node.a> h;
    private a i;
    private int j;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);
    }

    public GalleryCardContainer(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90ca798981f28b70a2bc10e7a5c178f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90ca798981f28b70a2bc10e7a5c178f9");
        }
    }

    private GalleryCardContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b2b835a2a2617c3f8f5252b9900d69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b2b835a2a2617c3f8f5252b9900d69");
        }
    }

    public GalleryCardContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ae8c956f76d412c2b6203986731470", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ae8c956f76d412c2b6203986731470");
            return;
        }
        this.h = new ArrayList();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27b560c46404a1aef6d80265270ea34a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27b560c46404a1aef6d80265270ea34a");
            return;
        }
        this.c = new SpeedRecyclerView(context);
        this.c.setOverScrollMode(2);
        addView(this.c, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f99b6320b06b6ba9aeff018e0e0735a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f99b6320b06b6ba9aeff018e0e0735a6");
            return;
        }
        if (this.d != null && this.e != null && this.d.getItemCount() > 1 && !TextUtils.isEmpty(this.e.i)) {
            Intent intent = new Intent(this.e.i);
            intent.putExtra("index_key", i);
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
        }
    }

    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2920c1bca0ef15f22d0737f730704cdd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2920c1bca0ef15f22d0737f730704cdd")).intValue();
        }
        if (this.h == null) {
            return 0;
        }
        return this.h.size();
    }

    public void setIndexChangedListener(a aVar) {
        this.i = aVar;
    }
}
