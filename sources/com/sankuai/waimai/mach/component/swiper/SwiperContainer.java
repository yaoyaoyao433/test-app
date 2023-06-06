package com.sankuai.waimai.mach.component.swiper;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.swiper.recyclerview.ScaleLayoutManager;
import com.sankuai.waimai.mach.component.swiper.recyclerview.SwiperRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SwiperContainer extends FrameLayout {
    public static ChangeQuickRedirect a = null;
    private static final String g = "SwiperContainer";
    SwiperRecyclerView b;
    com.sankuai.waimai.mach.component.swiper.a c;
    c d;
    com.sankuai.waimai.mach.node.a e;
    ScaleLayoutManager f;
    private a h;
    private boolean i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    public static /* synthetic */ boolean a(SwiperContainer swiperContainer, boolean z) {
        swiperContainer.i = false;
        return false;
    }

    public void setIndexChangedListener(a aVar) {
        this.h = aVar;
    }

    public SwiperContainer(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5de89bdffc678b7c58905af11608649", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5de89bdffc678b7c58905af11608649");
        }
    }

    private SwiperContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cde38f896e13caedf6a42ecf843c8931", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cde38f896e13caedf6a42ecf843c8931");
        }
    }

    public SwiperContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2bcd3353ad97f5956c828fc61441db7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2bcd3353ad97f5956c828fc61441db7");
            return;
        }
        this.i = true;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6ae8f085835d990336bf792c30c28ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6ae8f085835d990336bf792c30c28ba");
            return;
        }
        this.b = new SwiperRecyclerView(getContext());
        this.b.setNestedScrollingEnabled(false);
        this.b.setClipToPadding(false);
        this.b.setClipChildren(false);
        addView(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48139de8f7ccc0689f48a38614f9c93a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48139de8f7ccc0689f48a38614f9c93a");
            return;
        }
        if (this.c != null && this.d != null && this.c.getItemCount() > 1 && !TextUtils.isEmpty(this.d.q)) {
            Intent intent = new Intent(this.d.q);
            intent.putExtra("index_key", i);
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
        }
    }

    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfed2be243bb0aff9137c1f1ade57a8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfed2be243bb0aff9137c1f1ade57a8b")).intValue();
        }
        if (this.c != null) {
            return this.c.getItemCount();
        }
        return 0;
    }
}
