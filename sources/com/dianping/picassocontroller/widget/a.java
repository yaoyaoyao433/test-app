package com.dianping.picassocontroller.widget;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.dianping.picasso.PicassoViewWrapperUtil;
import com.dianping.picasso.creator.BaseViewWrapper;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picassocontroller.vc.g;
import com.dianping.picassocontroller.widget.PCSSwipeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<T extends View> extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private T innerView;
    public PCSSwipeLayout swipeLayout;

    public abstract T setInnerView(Context context);

    public a(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da9e191148d0f0b16aca0fc8d3fad767", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da9e191148d0f0b16aca0fc8d3fad767");
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49eaae6f670f7adbb67eea4f5ec2b927", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49eaae6f670f7adbb67eea4f5ec2b927");
        } else {
            init(context);
        }
    }

    private void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f7368a060641cbdda12aa8429c86d28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f7368a060641cbdda12aa8429c86d28");
        } else {
            createBounceView(context);
        }
    }

    public void setOnRefreshListener(PCSSwipeLayout.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "433b8e0fecb75f467707678948f241ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "433b8e0fecb75f467707678948f241ce");
        } else if (this.swipeLayout != null) {
            this.swipeLayout.setOnRefreshListener(aVar);
        }
    }

    public void stopRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f357194f15600bd0bac1d547fcca42c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f357194f15600bd0bac1d547fcca42c2");
        } else {
            post(new Runnable() { // from class: com.dianping.picassocontroller.widget.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d7224b44c39bececfa0eba18e257d123", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d7224b44c39bececfa0eba18e257d123");
                    } else {
                        a.this.finishPullRefresh();
                    }
                }
            });
        }
    }

    public void finishPullRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "550d507c0a29d432dfd37058a49fc8f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "550d507c0a29d432dfd37058a49fc8f9");
        } else if (this.swipeLayout != null) {
            final PCSSwipeLayout pCSSwipeLayout = this.swipeLayout;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = PCSSwipeLayout.a;
            if (PatchProxy.isSupport(objArr2, pCSSwipeLayout, changeQuickRedirect3, false, "fb9e56c58e45910c9e7dfee732af8f3e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, pCSSwipeLayout, changeQuickRedirect3, false, "fb9e56c58e45910c9e7dfee732af8f3e");
                return;
            }
            if (pCSSwipeLayout.c != null && pCSSwipeLayout.c.isRunning()) {
                pCSSwipeLayout.c.cancel();
            }
            pCSSwipeLayout.f = true;
            int c = pCSSwipeLayout.b.c();
            Runnable runnable = new Runnable() { // from class: com.dianping.picassocontroller.widget.PCSSwipeLayout.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ecba298bd42aeeac9c196a650ba97254", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ecba298bd42aeeac9c196a650ba97254");
                    } else {
                        PCSSwipeLayout.this.b(PCSSwipeLayout.this.b != null ? PCSSwipeLayout.this.b.getMeasuredHeight() : 0);
                    }
                }
            };
            if (c > 0) {
                pCSSwipeLayout.postDelayed(runnable, c);
            } else {
                runnable.run();
            }
        }
    }

    private PCSSwipeLayout createBounceView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e5b2485670a03170e0f24f226e02670", RobustBitConfig.DEFAULT_VALUE)) {
            return (PCSSwipeLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e5b2485670a03170e0f24f226e02670");
        }
        this.swipeLayout = new PCSSwipeLayout(context);
        this.swipeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.innerView = setInnerView(context);
        if (this.innerView == null) {
            return null;
        }
        this.swipeLayout.addView(this.innerView, new FrameLayout.LayoutParams(-1, -1));
        PCSSwipeLayout pCSSwipeLayout = this.swipeLayout;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = PCSSwipeLayout.a;
        if (PatchProxy.isSupport(objArr2, pCSSwipeLayout, changeQuickRedirect3, false, "f99ed23dc01885a8bc344f1e19367874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pCSSwipeLayout, changeQuickRedirect3, false, "f99ed23dc01885a8bc344f1e19367874");
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
            pCSSwipeLayout.b = new PCSRefreshView(pCSSwipeLayout.getContext());
            pCSSwipeLayout.addView(pCSSwipeLayout.b, layoutParams);
        }
        addView(this.swipeLayout, -1, -1);
        return this.swipeLayout;
    }

    public T getInnerView() {
        return this.innerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setHeaderViewModel(PicassoModel picassoModel) {
        PCSRefreshView headerView;
        int parseColor;
        boolean z = true;
        Object[] objArr = {picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3a6591465f9efe91391a8640e8b7706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3a6591465f9efe91391a8640e8b7706");
            return;
        }
        BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(picassoModel.type));
        if (viewWrapperByType == 0) {
            return;
        }
        setRefreshEnable(true);
        com.dianping.picassocontroller.vc.b a = com.dianping.picassocontroller.vc.c.a(picassoModel.hostId);
        if (this.swipeLayout == null || !(a instanceof g) || (headerView = this.swipeLayout.getHeaderView()) == null) {
            return;
        }
        String str = picassoModel.backgroundColor;
        if (str != null) {
            if (!TextUtils.isEmpty(str) && (parseColor = Color.parseColor(str)) != 0) {
                this.swipeLayout.setRefreshBgColor(parseColor);
            }
        } else if (!TextUtils.isEmpty(picassoModel.startColor) && !TextUtils.isEmpty(picassoModel.endColor)) {
            this.swipeLayout.getHeaderView().setBackground(picassoModel.getViewParams().backgroundDrawable);
            picassoModel.getViewParams().backgroundDrawable = null;
        }
        View content = headerView.getContent();
        if (!((content != null && (content.getTag(R.id.id_picasso_model) instanceof PicassoModel) && ((PicassoModel) content.getTag(R.id.id_picasso_model)).type == picassoModel.type) ? false : false)) {
            content = viewWrapperByType.initView(getContext(), picassoModel, ((g) a).s);
            headerView.setContent(content);
        }
        viewWrapperByType.refreshView(content, picassoModel, ((g) a).s);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.swipeLayout.getHeaderView().getLayoutParams();
        layoutParams.topMargin = picassoModel.getViewParams().y > 0 ? picassoModel.getViewParams().y : 0;
        this.swipeLayout.getHeaderView().setLayoutParams(layoutParams);
        this.swipeLayout.setRefreshHeight(picassoModel.getViewParams().height);
    }

    public void setRefreshEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "513ea573428f2c9635c1d70fb3ba23cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "513ea573428f2c9635c1d70fb3ba23cc");
        } else if (this.swipeLayout != null) {
            this.swipeLayout.setPullRefreshEnable(z);
        }
    }

    public boolean isRefreshEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cc339330720baf401044e47341e3d3a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cc339330720baf401044e47341e3d3a")).booleanValue() : this.swipeLayout != null && this.swipeLayout.d;
    }

    public boolean isRefreshing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a02d541ed79d2403db78d75e77b930db", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a02d541ed79d2403db78d75e77b930db")).booleanValue() : this.swipeLayout != null && this.swipeLayout.e;
    }

    public boolean isStoppingRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a18e2573dc64d120fccbc4b7aa69471a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a18e2573dc64d120fccbc4b7aa69471a")).booleanValue() : this.swipeLayout != null && this.swipeLayout.f;
    }

    public void startRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1ad33e7b30f60538bc114d2569581bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1ad33e7b30f60538bc114d2569581bd");
        } else {
            post(new Runnable() { // from class: com.dianping.picassocontroller.widget.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "72326fc45a585ba7c82c2e0df8ad51ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "72326fc45a585ba7c82c2e0df8ad51ae");
                    } else if (a.this.swipeLayout != null) {
                        a.this.swipeLayout.a(0);
                    }
                }
            });
        }
    }
}
