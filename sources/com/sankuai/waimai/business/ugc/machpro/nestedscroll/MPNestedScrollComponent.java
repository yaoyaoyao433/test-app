package com.sankuai.waimai.business.ugc.machpro.nestedscroll;

import android.animation.ValueAnimator;
import android.support.annotation.Keep;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.NestedScrollView;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.facebook.yoga.YogaMeasureFunction;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.ugc.machpro.nestedscroll.MPNestedScrollContainer;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.util.b;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPNestedScrollComponent extends MPComponent<MPNestedScrollContainer> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ MPNestedScrollContainer createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "587be2ba7b46232125e0e14b4c7c03e6", RobustBitConfig.DEFAULT_VALUE) ? (MPNestedScrollContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "587be2ba7b46232125e0e14b4c7c03e6") : new MPNestedScrollContainer(this.mMachContext.getContext(), this);
    }

    public MPNestedScrollComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dbfc7ec3882307954055cfa4fa16457", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dbfc7ec3882307954055cfa4fa16457");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r14.equals("bounces") != false) goto L18;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateAttribute(java.lang.String r14, java.lang.Object r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.business.ugc.machpro.nestedscroll.MPNestedScrollComponent.a
            java.lang.String r12 = "dedd472df212480c11826074547b68ac"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            return
        L1e:
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 == 0) goto L25
            return
        L25:
            r1 = -1
            int r2 = r14.hashCode()
            r3 = 70310635(0x430daeb, float:2.0789223E-36)
            if (r2 == r3) goto L50
            r0 = 1636949104(0x6191dc70, float:3.3633276E20)
            if (r2 == r0) goto L45
            r0 = 1676640788(0x63ef8214, float:8.83629E21)
            if (r2 == r0) goto L3a
            goto L59
        L3a:
            java.lang.String r0 = "headerHeight"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L59
            r0 = 0
            goto L5a
        L45:
            java.lang.String r0 = "stickyHeight"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L50:
            java.lang.String r2 = "bounces"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = -1
        L5a:
            switch(r0) {
                case 0: goto L6f;
                case 1: goto L62;
                case 2: goto L61;
                default: goto L5d;
            }
        L5d:
            super.updateAttribute(r14, r15)
            return
        L61:
            return
        L62:
            T extends android.view.View r14 = r13.mView
            com.sankuai.waimai.business.ugc.machpro.nestedscroll.MPNestedScrollContainer r14 = (com.sankuai.waimai.business.ugc.machpro.nestedscroll.MPNestedScrollContainer) r14
            float r15 = com.sankuai.waimai.machpro.util.b.a(r15)
            int r15 = (int) r15
            r14.setStickyHeaderHeight(r15)
            return
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.ugc.machpro.nestedscroll.MPNestedScrollComponent.updateAttribute(java.lang.String, java.lang.Object):void");
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void addEventListener(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1d33c357364476f8ba080270e907bf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1d33c357364476f8ba080270e907bf6");
        } else if ("stickyChange".equals(str)) {
            ((MPNestedScrollContainer) this.mView).setListenStickyChange(Boolean.TRUE);
        } else if (Constants.FPS_TYPE_SCROLL.equals(str)) {
            ((MPNestedScrollContainer) this.mView).setScrollListener(new MPNestedScrollContainer.b() { // from class: com.sankuai.waimai.business.ugc.machpro.nestedscroll.MPNestedScrollComponent.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.ugc.machpro.nestedscroll.MPNestedScrollContainer.b
                public final void a(int i, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "683c2a87bec63775b4aa8e50737967cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "683c2a87bec63775b4aa8e50737967cc");
                        return;
                    }
                    MachMap machMap = new MachMap();
                    MachMap machMap2 = new MachMap();
                    machMap2.put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(b.a(i)));
                    machMap2.put(Constants.GestureMoveEvent.KEY_X, 0);
                    machMap.put("contentOffset", machMap2);
                    MachArray machArray = new MachArray();
                    machArray.add(machMap);
                    MPNestedScrollComponent.this.dispatchEvent(com.meituan.metrics.common.Constants.FPS_TYPE_SCROLL, machArray);
                }
            });
        } else {
            super.addEventListener(str);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAppendChild(MPComponent mPComponent, MPComponent mPComponent2) {
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15ed0d732ebdd4cb95615e842da5f08f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15ed0d732ebdd4cb95615e842da5f08f");
            return;
        }
        super.onAppendChild(mPComponent, mPComponent2);
        String a2 = b.a(mPComponent.getDataAttribute("data-role"), "");
        if (TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER.equals(a2)) {
            MPNestedScrollContainer mPNestedScrollContainer = (MPNestedScrollContainer) this.mView;
            Object[] objArr2 = {mPComponent};
            ChangeQuickRedirect changeQuickRedirect2 = MPNestedScrollContainer.i;
            if (PatchProxy.isSupport(objArr2, mPNestedScrollContainer, changeQuickRedirect2, false, "a2744fd676a5ff72ec2dbce7b740f101", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mPNestedScrollContainer, changeQuickRedirect2, false, "a2744fd676a5ff72ec2dbce7b740f101");
            } else if (mPNestedScrollContainer.j == null && mPComponent != null) {
                mPNestedScrollContainer.k = mPComponent;
                NestedScrollView nestedScrollView = new NestedScrollView(mPNestedScrollContainer.getContext());
                nestedScrollView.addView(mPComponent.getView());
                mPNestedScrollContainer.j = nestedScrollView;
                mPNestedScrollContainer.addView(mPNestedScrollContainer.j);
                CoordinatorLayout.c cVar = (CoordinatorLayout.c) mPNestedScrollContainer.j.getLayoutParams();
                if (cVar != null && cVar.a == null) {
                    cVar.a(mPNestedScrollContainer.p);
                }
            }
            this.mYogaNode.a((YogaMeasureFunction) null);
        } else if ("content".equals(a2)) {
            MPNestedScrollContainer mPNestedScrollContainer2 = (MPNestedScrollContainer) this.mView;
            Object[] objArr3 = {mPComponent};
            ChangeQuickRedirect changeQuickRedirect3 = MPNestedScrollContainer.i;
            if (PatchProxy.isSupport(objArr3, mPNestedScrollContainer2, changeQuickRedirect3, false, "dc5de9902014e56221c064c923af405d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, mPNestedScrollContainer2, changeQuickRedirect3, false, "dc5de9902014e56221c064c923af405d");
            } else if (mPNestedScrollContainer2.l == null && mPComponent != null) {
                mPNestedScrollContainer2.m = mPComponent;
                FrameLayout frameLayout = new FrameLayout(mPNestedScrollContainer2.getContext());
                frameLayout.addView(mPComponent.getView());
                mPNestedScrollContainer2.l = frameLayout;
                mPNestedScrollContainer2.addView(mPNestedScrollContainer2.l);
            }
            this.mYogaNode.a((YogaMeasureFunction) null);
        }
    }

    @JSMethod(methodName = "expandHeader")
    @Keep
    public void expandHeader(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07276ff31d3ecdf605857d82c6d7f54e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07276ff31d3ecdf605857d82c6d7f54e");
        } else if (machMap != null) {
            final MPNestedScrollContainer mPNestedScrollContainer = (MPNestedScrollContainer) this.mView;
            int c = b.c(machMap.get("duration"));
            Object[] objArr2 = {Integer.valueOf(c)};
            ChangeQuickRedirect changeQuickRedirect2 = MPNestedScrollContainer.i;
            if (PatchProxy.isSupport(objArr2, mPNestedScrollContainer, changeQuickRedirect2, false, "75605a044726d8dc1f8b8db297228782", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mPNestedScrollContainer, changeQuickRedirect2, false, "75605a044726d8dc1f8b8db297228782");
            } else if (mPNestedScrollContainer.l == null || mPNestedScrollContainer.j == null) {
            } else {
                ValueAnimator ofInt = ValueAnimator.ofInt(mPNestedScrollContainer.j.getTop(), 0);
                ofInt.setDuration(c);
                ofInt.setInterpolator(new AccelerateInterpolator());
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.ugc.machpro.nestedscroll.MPNestedScrollContainer.1
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr3 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b7ab0ece0828a3384b4c848d2cf69c07", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b7ab0ece0828a3384b4c848d2cf69c07");
                        } else {
                            mPNestedScrollContainer.setScrollHeaderTop(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    }
                });
                ofInt.start();
                mPNestedScrollContainer.a(false);
            }
        }
    }

    @JSMethod(methodName = "collapseHeader")
    @Keep
    public void collapseHeader(MachMap machMap) {
        int top;
        int i;
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa8e4d9a94ee2ca8d231e2cd7496d90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa8e4d9a94ee2ca8d231e2cd7496d90");
        } else if (machMap != null) {
            final MPNestedScrollContainer mPNestedScrollContainer = (MPNestedScrollContainer) this.mView;
            int c = b.c(machMap.get("duration"));
            Object[] objArr2 = {Integer.valueOf(c)};
            ChangeQuickRedirect changeQuickRedirect2 = MPNestedScrollContainer.i;
            if (PatchProxy.isSupport(objArr2, mPNestedScrollContainer, changeQuickRedirect2, false, "1e2c1cfa3ee8301602599795c8a422d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mPNestedScrollContainer, changeQuickRedirect2, false, "1e2c1cfa3ee8301602599795c8a422d9");
            } else if (mPNestedScrollContainer.l == null || mPNestedScrollContainer.j == null || (top = mPNestedScrollContainer.j.getTop()) == (i = (-mPNestedScrollContainer.n) + mPNestedScrollContainer.o)) {
            } else {
                ValueAnimator ofInt = ValueAnimator.ofInt(top, i);
                ofInt.setDuration(c);
                ofInt.setInterpolator(new AccelerateInterpolator());
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.ugc.machpro.nestedscroll.MPNestedScrollContainer.2
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr3 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f821ef376ab2d3cefb245295cf619c85", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f821ef376ab2d3cefb245295cf619c85");
                        } else {
                            mPNestedScrollContainer.setScrollHeaderTop(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    }
                });
                ofInt.start();
                mPNestedScrollContainer.a(true);
            }
        }
    }
}
