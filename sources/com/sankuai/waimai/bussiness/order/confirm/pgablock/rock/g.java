package com.sankuai.waimai.bussiness.order.confirm.pgablock.rock;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.addrsdk.constants.AddressScene;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.business.order.submit.model.AdditionalBargain;
import com.sankuai.waimai.business.order.submit.model.BusinessType;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity;
import com.sankuai.waimai.bussiness.order.confirm.model.b;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.ExtendInfoModel;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.serviceguarantee.ServiceGuaranteeInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.SubmitInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CallbackInfo;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor;
import com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.mach.tag.DynamicTagProcessor;
import com.sankuai.waimai.platform.mach.util.WmMachImageLoaderUtil;
import com.sankuai.waimai.platform.mach.webpimage.WebpImageTagProcessor;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.view.a;
import com.sankuai.waimai.rocks.view.mach.c;
import com.sankuai.waimai.rocks.view.mach.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.meituan.android.cube.pga.block.a<a, b, com.sankuai.waimai.bussiness.order.confirm.a> {
    public static ChangeQuickRedirect r;
    private Rect A;
    private k B;
    private com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b C;
    private com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.a D;
    private com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.c E;
    private com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.c F;
    private com.sankuai.waimai.bussiness.order.confirm.pgablock.drugcard.rock.a G;
    private String H;
    private m I;
    private RecyclerView J;
    private View K;
    private ImageView L;
    private boolean M;
    private boolean N;
    private boolean O;
    private int P;
    private j Q;
    private HashMap<String, com.sankuai.waimai.mach.recycler.c> R;
    protected com.sankuai.waimai.rocks.view.a s;
    public Map<String, Object> t;
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a u;
    public View v;
    public View w;
    public AlphaAnimation x;
    public TranslateAnimation y;
    private Rect z;

    public static /* synthetic */ void A(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "c6122c49ee54344b9ebc7d3aced26bf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "c6122c49ee54344b9ebc7d3aced26bf8");
        } else {
            com.sankuai.waimai.bussiness.order.base.a.a((Activity) gVar.m(), AddressScene.DEFAULT_SCENE, (AddressItem) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(com.sankuai.waimai.foundation.location.v2.d.a().toJson(d.c.get("submit_address")), (Class<Object>) AddressItem.class), ((com.sankuai.waimai.bussiness.order.confirm.a) gVar.F()).aH_(), ((com.sankuai.waimai.bussiness.order.confirm.a) gVar.F()).aI_(), null);
        }
    }

    public static /* synthetic */ void B(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "53b8bc17892270cf0d1d76f3420034f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "53b8bc17892270cf0d1d76f3420034f4");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.location.a.b(gVar.m(), (AddressItem) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(com.sankuai.waimai.foundation.location.v2.d.a().toJson(d.c.get("submit_address")), (Class<Object>) AddressItem.class));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "3e869985d50ecca2a0ac7fe0976e4adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "3e869985d50ecca2a0ac7fe0976e4adf");
        } else {
            com.sankuai.waimai.bussiness.order.base.a.a(gVar.m(), ((com.sankuai.waimai.bussiness.order.confirm.a) gVar.F()).aH_(), ((com.sankuai.waimai.bussiness.order.confirm.a) gVar.F()).aI_());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
        if ("".equals(r0) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g r25, int r26, int r27, android.content.Intent r28) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.a(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g, int, int, android.content.Intent):void");
    }

    public static /* synthetic */ Rect b(g gVar) {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "9189462a8ef461510b6fac220e5d1b78", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "9189462a8ef461510b6fac220e5d1b78");
        }
        if (gVar.A.isEmpty()) {
            ((com.sankuai.waimai.bussiness.order.confirm.a) gVar.F()).R.a().b.getGlobalVisibleRect(gVar.A);
            Rect rect = gVar.A;
            int i2 = rect.bottom;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = r;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "96d77c5c6c87b56de1ba4b7da2f558f7", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "96d77c5c6c87b56de1ba4b7da2f558f7")).intValue();
            } else {
                LinearLayout linearLayout = ((com.sankuai.waimai.bussiness.order.confirm.a) gVar.F()).aL.a().b;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    i = linearLayout.getHeight();
                }
            }
            rect.bottom = i2 - i;
            gVar.A.top += ((com.sankuai.waimai.bussiness.order.confirm.a) gVar.F()).aQ.a().c();
        }
        return gVar.A;
    }

    public static /* synthetic */ void b(g gVar, Map map) {
        int a2;
        com.sankuai.waimai.mach.recycler.a aVar;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "511cf7ad03054822c0b2938fb09add37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "511cf7ad03054822c0b2938fb09add37");
            return;
        }
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(map.get("index"));
            a2 = r.a(sb.toString(), 0);
        } else {
            a2 = gVar.I.a("wm_confirm_order_additional_bargain");
        }
        if (a2 <= 0 && gVar.I.a("wm-order-confirm-marketing-ttsq-tying") > 0) {
            a2 = gVar.I.a("wm-order-confirm-marketing-ttsq-tying");
        }
        Object[] objArr2 = {Integer.valueOf(a2)};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "00b20ea4b6614799eaf1938e2dbd94c4", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.sankuai.waimai.mach.recycler.a) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "00b20ea4b6614799eaf1938e2dbd94c4");
        } else {
            RecyclerView.a adapter = gVar.J.getAdapter();
            if (adapter instanceof com.sankuai.waimai.rocks.view.recyclerview.a) {
                com.sankuai.waimai.rocks.view.viewmodel.e eVar = ((com.sankuai.waimai.rocks.view.recyclerview.a) adapter).b.get(a2);
                if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a) {
                    aVar = ((com.sankuai.waimai.rocks.view.viewmodel.a) eVar).p;
                }
            }
            aVar = null;
        }
        if (aVar != null) {
            aVar.e();
        }
    }

    public static /* synthetic */ boolean b(g gVar, boolean z) {
        gVar.M = false;
        return false;
    }

    public static /* synthetic */ boolean d(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "99673d1e705a49a9ff16478740bb350a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "99673d1e705a49a9ff16478740bb350a")).booleanValue() : ((com.sankuai.waimai.bussiness.order.confirm.a) gVar.F()).aL_() == 0 || ((com.sankuai.waimai.bussiness.order.confirm.a) gVar.F()).aL_() == 3;
    }

    public static /* synthetic */ void h(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "bdd11950dfb2723a30b77ae218f0c3c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "bdd11950dfb2723a30b77ae218f0c3c2");
            return;
        }
        Rect rect = ((com.sankuai.waimai.bussiness.order.confirm.a) gVar.F()).V.a().b;
        if (rect != null) {
            Rect rect2 = new Rect();
            int[] iArr = new int[2];
            View findViewByPosition = ((LinearLayoutManager) gVar.J.getLayoutManager()).findViewByPosition(gVar.I.a("wm_confirm_order_food_list_info_mach"));
            if (findViewByPosition != null) {
                findViewByPosition.getLocationOnScreen(iArr);
                rect2.set(iArr[0], (iArr[1] + findViewByPosition.getHeight()) - com.sankuai.waimai.foundation.utils.g.a(gVar.m(), gVar.u.l.a()), iArr[0] + findViewByPosition.getWidth(), (iArr[1] + findViewByPosition.getHeight()) - com.sankuai.waimai.foundation.utils.g.a(gVar.m(), gVar.u.l.a() + 20.0f));
                if (rect.contains(rect2)) {
                    return;
                }
                gVar.J.scrollBy(0, findViewByPosition.getBottom() - com.sankuai.waimai.foundation.utils.g.a(gVar.m(), gVar.u.l.a() + (gVar.N() ? 50 : 80)));
                return;
            }
            int a2 = gVar.I.a("wm_confirm_order_wm_card");
            if (gVar.I.a("wm_confirm_order_wm_card") < 0 && gVar.I.a("wm-order-confirm-marketing-ttsq-tying") > 0) {
                a2 = gVar.I.a("wm-order-confirm-marketing-ttsq-tying");
            }
            gVar.J.smoothScrollToPosition(a2);
            com.sankuai.waimai.platform.utils.l.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.36
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1aaf1febbc9469aa516770a001ef5ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1aaf1febbc9469aa516770a001ef5ab");
                    } else {
                        g.this.J.scrollBy(0, -com.sankuai.waimai.foundation.utils.g.a(g.this.m(), g.this.u.l.a() + (g.this.N() ? 50 : 0)));
                    }
                }
            }, 200, "float_layer");
        }
    }

    public static /* synthetic */ void i(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "6f193dda9c9dfbcd4aec6305ad3eb0fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "6f193dda9c9dfbcd4aec6305ad3eb0fd");
        } else {
            com.sankuai.waimai.platform.utils.l.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.35
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    boolean z2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b310150a20b80eeacb208a007849d6a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b310150a20b80eeacb208a007849d6a8");
                        return;
                    }
                    if (ah.a(((LinearLayoutManager) g.this.J.getLayoutManager()).findViewByPosition(g.this.I.a("wm_confirm_order_extend_information_mach")), ((com.sankuai.waimai.bussiness.order.confirm.a) g.this.F()).V.a().b)) {
                        com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a aVar = g.this.u.n;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "35b711c2eab781595cf227e329510802", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "35b711c2eab781595cf227e329510802");
                            return;
                        }
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "80d483aebed584a331387406db80759e", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "80d483aebed584a331387406db80759e")).booleanValue();
                        } else {
                            if (!aVar.j && !aVar.i) {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.a;
                                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "2a1b82ac47c3aa0f2301489a89bd27f0", RobustBitConfig.DEFAULT_VALUE)) {
                                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "2a1b82ac47c3aa0f2301489a89bd27f0")).booleanValue();
                                } else {
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.a;
                                    z2 = (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "03a5b38087ee0ad2f8cec185dc7db637", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "03a5b38087ee0ad2f8cec185dc7db637")).intValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(aVar.b, aVar.a(), 0)) >= aVar.c;
                                }
                                if (!z2) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            aVar.a("remark_update_bubble_event", "show", "bubble");
                            aVar.i = true;
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.a;
                            if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "db3bf5428b572426e5f915f7464f0884", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "db3bf5428b572426e5f915f7464f0884");
                                return;
                            }
                            String a2 = aVar.a();
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(aVar.b, a2, com.sankuai.waimai.platform.capacity.persistent.sp.a.b(aVar.b, a2, 0) + 1);
                        }
                    }
                }
            }, 200, "remark_info");
        }
    }

    public static /* synthetic */ int m(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "0d5a02fbfc57fd0413c5c6f7a4110662", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "0d5a02fbfc57fd0413c5c6f7a4110662")).intValue();
        }
        int[] iArr = new int[2];
        View findViewByPosition = ((LinearLayoutManager) gVar.J.getLayoutManager()).findViewByPosition(0);
        if (findViewByPosition != null) {
            findViewByPosition.getLocationOnScreen(iArr);
            int i = iArr[1] + 140;
            if (iArr[1] <= 0) {
                return 0;
            }
            return i;
        }
        return 0;
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3144b9a76328f040638c33ae803d609a", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3144b9a76328f040638c33ae803d609a") : new b();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e4ac563142e5b922aaef14f7ef7407", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e4ac563142e5b922aaef14f7ef7407") : new a(m());
    }

    public g(com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d26abe8d19e71f9c7c3ed28112e34e61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d26abe8d19e71f9c7c3ed28112e34e61");
            return;
        }
        this.t = new HashMap();
        this.A = new Rect();
        this.M = true;
        this.N = true;
        this.O = true;
        this.R = new HashMap<>();
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "036b0625ba28294d718406abb2d126d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "036b0625ba28294d718406abb2d126d8");
            return;
        }
        bundle.putBoolean("mCheckShippingArea", this.O);
        bundle.putString("preDeliveryTime", this.u.g.i());
        com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.c cVar = this.u.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.c.p;
        bundle.putString("preDeliveryDis", PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "7ac63cc492c3e18968fee6f3e0e79217", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "7ac63cc492c3e18968fee6f3e0e79217") : cVar.a("dateTypeTip", ""));
        bundle.putInt("chosenDeliveryTime", this.u.g.e());
        bundle.putSerializable("mAddressItem", this.u.g.f);
        bundle.putString("expectedDeliveryTimeString", this.u.g.f());
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6520d025510de6605f25a518fbcfe62a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6520d025510de6605f25a518fbcfe62a");
            return;
        }
        super.c(bundle);
        this.O = bundle.getBoolean("mCheckShippingArea");
        P();
        String string = bundle.getString("preDeliveryTime");
        int i = bundle.getInt("chosenDeliveryTime");
        this.u.g.a(bundle.getString("expectedDeliveryTimeString"));
        String string2 = m().getString(R.string.wm_order_confirm_not_choose_time);
        if (TextUtils.isEmpty(string) || string.equals(string2)) {
            this.u.g.c();
        } else {
            this.u.g.a(i);
        }
        String string3 = bundle.getString("preDeliveryDis");
        if (!TextUtils.isEmpty(string)) {
            this.u.g.d(string3);
        }
        AddressItem c = com.sankuai.waimai.platform.domain.manager.location.a.c(m());
        if (c != null && !TextUtils.isEmpty(c.addrBrief)) {
            this.u.g.a(c);
        } else {
            AddressItem addressItem = com.sankuai.waimai.platform.utils.f.a(bundle, "mAddressItem") != null ? (AddressItem) com.sankuai.waimai.platform.utils.f.a(bundle, "mAddressItem") : null;
            if (addressItem != null) {
                this.u.g.a(c);
                com.sankuai.waimai.platform.domain.manager.location.a.b(m(), addressItem);
            }
        }
        this.u.g.u = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [com.meituan.android.cube.pga.type.a] */
    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Rect rect;
        com.sankuai.waimai.rocks.view.mach.d dVar;
        com.sankuai.waimai.rocks.view.a a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "675bdfb82f5a1d2b90bda4a931632072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "675bdfb82f5a1d2b90bda4a931632072");
            return;
        }
        super.s();
        P();
        this.H = Q();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a36b25baf0ba9397fd65edc41eda9d1", RobustBitConfig.DEFAULT_VALUE)) {
            rect = (Rect) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a36b25baf0ba9397fd65edc41eda9d1");
        } else {
            Rect rect2 = new Rect();
            int a3 = com.sankuai.waimai.foundation.utils.g.a(m());
            int b2 = com.sankuai.waimai.foundation.utils.g.b(m());
            rect2.left = 0;
            rect2.top = com.sankuai.waimai.foundation.utils.g.a(m(), 87.0f);
            rect2.right = a3;
            rect2.bottom = b2 - com.sankuai.waimai.foundation.utils.g.a(m(), 72.0f);
            rect = new Rect(0, 0, a3, b2);
        }
        this.z = rect;
        this.B = new k();
        this.u = new com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a(m(), (com.sankuai.waimai.bussiness.order.confirm.a) F(), (com.sankuai.waimai.bussiness.order.confirm.helper.f) F());
        this.u.a();
        this.C = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a();
        this.D = new com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.a((com.sankuai.waimai.bussiness.order.confirm.helper.f) F(), m(), (com.sankuai.waimai.bussiness.order.confirm.a) F(), l());
        this.E = new com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.c((com.sankuai.waimai.bussiness.order.confirm.a) F(), m());
        this.F = new com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.c((com.sankuai.waimai.bussiness.order.confirm.a) F(), m());
        this.G = new com.sankuai.waimai.bussiness.order.confirm.pgablock.drugcard.rock.a(m(), (com.sankuai.waimai.bussiness.order.confirm.a) F());
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aR.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c282f21a6df8d685159287718e19285e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c282f21a6df8d685159287718e19285e") : g.this.i();
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).i.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.12
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Object[] objArr3 = {bool};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "68947226d3c7f30543057aaefa2f8d19", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "68947226d3c7f30543057aaefa2f8d19");
                    return;
                }
                g.this.O = true;
                g.this.P();
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).ba.b = new com.meituan.android.cube.pga.action.d<Void>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.23
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cfe508ef456f321121623f38d4e08f0d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Void) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cfe508ef456f321121623f38d4e08f0d");
                }
                d.a("hint_next_refresh", Boolean.FALSE);
                return null;
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).T.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.34
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca57397f5f111879210ec13c03deedf7", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca57397f5f111879210ec13c03deedf7") : g.this.i().findViewById(R.id.bg_head_title);
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).V.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.45
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d050afd8136347e2006c5ecd8874a4c7", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d050afd8136347e2006c5ecd8874a4c7") : g.b(g.this);
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).R.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.50
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b9f930833a49d2487cd5e69368ec2e15", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b9f930833a49d2487cd5e69368ec2e15") : g.this.J;
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).o.a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.51
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(b.a aVar) {
                b.a aVar2 = aVar;
                Object[] objArr3 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3d1dd55d3b37455bf6d4b7a68d83c826", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3d1dd55d3b37455bf6d4b7a68d83c826");
                } else if (aVar2 != null) {
                    g.a(g.this, aVar2.a, aVar2.b, aVar2.c);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).Z.a(new com.meituan.android.cube.pga.action.b<i.c<Integer, Integer>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.52
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.c<Integer, Integer> cVar) {
                i.c<Integer, Integer> cVar2 = cVar;
                Object[] objArr3 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b24ddd06ba620f77d33e7ccb923e9e67", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b24ddd06ba620f77d33e7ccb923e9e67");
                    return;
                }
                final g gVar = g.this;
                int intValue = cVar2.c.intValue();
                int intValue2 = cVar2.d.intValue();
                Object[] objArr4 = {Integer.valueOf(intValue), Integer.valueOf(intValue2)};
                ChangeQuickRedirect changeQuickRedirect4 = g.r;
                if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "1fbd38b192ec5623d771332f3ae21922", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "1fbd38b192ec5623d771332f3ae21922");
                    return;
                }
                String b3 = gVar.b(intValue);
                if (TextUtils.isEmpty(b3)) {
                    b3 = gVar.m().getString(R.string.wm_order_confirm_still_order);
                }
                DialogInterface.OnClickListener c = gVar.c(intValue);
                if (c == null) {
                    c = new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.44
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "18af9148d2825805863771555456d406", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "18af9148d2825805863771555456d406");
                                return;
                            }
                            ((com.sankuai.waimai.bussiness.order.confirm.a) g.this.F()).aa.a();
                            g.this.O = false;
                            g.this.P();
                        }
                    };
                }
                String b4 = gVar.b(intValue2);
                if (TextUtils.isEmpty(b4)) {
                    b4 = gVar.m().getString(R.string.wm_order_confirm_go_to_map);
                }
                DialogInterface.OnClickListener c2 = gVar.c(intValue2);
                if (c2 == null) {
                    c2 = new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.46
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e28cf60faba615a8f201bdf090d856ef", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e28cf60faba615a8f201bdf090d856ef");
                            } else {
                                g.A(g.this);
                            }
                        }
                    };
                }
                if (gVar.m() != null) {
                    new CustomDialog.a(gVar.m()).a(gVar.m().getString(R.string.wm_order_confirm_main_title_1)).a(gVar.N() ? R.style.WmOrderDialogWindow : -1).b(gVar.m().getString(R.string.wm_order_confirm_sub_title_1)).b(R.drawable.wm_order_confirm_address_not_in_range_1).a(b4, c2).b(b3, c).a(true).b();
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).av.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.53
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8b0153cd97e7a551baa07361ef0a5d97", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8b0153cd97e7a551baa07361ef0a5d97") : g.d(g.this) ? Boolean.valueOf(g.this.u.g.s()) : Boolean.valueOf(g.this.u.h.n());
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).ax.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0c0d67c3aa1abdfb1a3b3ee70ab7f2ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0c0d67c3aa1abdfb1a3b3ee70ab7f2ed");
                } else if (g.d(g.this)) {
                    g.this.u.g.d();
                } else {
                    g.this.u.h.d();
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).ay.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a9fa9851b44eeef256c5b102e929ecba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a9fa9851b44eeef256c5b102e929ecba");
                    return;
                }
                com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.a aVar = g.this.D;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "9f8f62348c518a05c9ae72e3a3995378", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "9f8f62348c518a05c9ae72e3a3995378");
                } else if (aVar.f != null) {
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.b bVar = aVar.f;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.b.a;
                    if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "6e7451ea88e3f289c5924be179846938", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "6e7451ea88e3f289c5924be179846938");
                    } else {
                        bVar.b.f();
                    }
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).N.a(new com.sankuai.waimai.business.order.api.a<i.c<Integer, Map<String, Object>>>(i()) { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.4
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.order.api.a
            public final /* synthetic */ void b(i.c<Integer, Map<String, Object>> cVar) {
                i.c<Integer, Map<String, Object>> cVar2 = cVar;
                Object[] objArr3 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be530d289b6f219b2f37d933bd1900ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be530d289b6f219b2f37d933bd1900ab");
                } else if (cVar2 == null || cVar2.d == null) {
                } else {
                    g.this.u.a(cVar2.d);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).M.a(new com.sankuai.waimai.business.order.api.a<Map<String, String>>(i()) { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.5
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.order.api.a
            public final /* synthetic */ void b(Map<String, String> map) {
                Map<String, String> map2 = map;
                Object[] objArr3 = {map2};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d27d96fe4c6608cc286afd5c38e7a0ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d27d96fe4c6608cc286afd5c38e7a0ac");
                } else if (map2 != null) {
                    Iterator<String> it = map2.values().iterator();
                    if (it.hasNext()) {
                        com.sankuai.waimai.foundation.router.a.a(g.this.m(), it.next());
                    }
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).az.a(new com.meituan.android.cube.pga.action.b<i.c<String, String>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.c<String, String> cVar) {
                i.c<String, String> cVar2 = cVar;
                Object[] objArr3 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6b1d48592e1b3dc02870991fc623b58d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6b1d48592e1b3dc02870991fc623b58d");
                } else {
                    g.this.u.h.c(cVar2.c, cVar2.d);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).ad.a(new com.meituan.android.cube.pga.action.b<Map<String, Object>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Map<String, Object> map) {
                Map<String, Object> map2 = map;
                Object[] objArr3 = {map2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "646699252b06ce649eefbc1b46148468", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "646699252b06ce649eefbc1b46148468");
                    return;
                }
                String valueOf = String.valueOf(map2.get("moduleId"));
                String valueOf2 = String.valueOf(map2.get("eventName"));
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a((com.sankuai.waimai.mach.recycler.c) g.this.R.get(valueOf), valueOf2);
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(valueOf2, (Map) map2.get("params"));
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).af.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b6f0d94767945946bfbfbe04d58db50c", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b6f0d94767945946bfbfbe04d58db50c");
                }
                AddressItem addressItem = (AddressItem) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(com.sankuai.waimai.foundation.location.v2.d.a().toJson(d.c.get("submit_address")), (Class<Object>) AddressItem.class);
                if (g.d(g.this)) {
                    if (addressItem == null || TextUtils.isEmpty(addressItem.addrBrief)) {
                        g.this.u.g.a(-1L, 1);
                        return null;
                    }
                    return addressItem;
                }
                return addressItem;
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aW.a(new com.meituan.android.cube.pga.action.b<String>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(String str) {
                AddressItem addressItem;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d89d1bc442918a5255aa20aba68efb9d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d89d1bc442918a5255aa20aba68efb9d");
                    return;
                }
                com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.b bVar = g.this.u.l;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.b.a;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "7fb9afa6b536b95447804fafbe68f538", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "7fb9afa6b536b95447804fafbe68f538");
                } else if (bVar.b == null || (addressItem = (AddressItem) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(d.c.get("submit_address")), (Class<Object>) AddressItem.class)) == null) {
                } else {
                    com.sankuai.waimai.bussiness.order.base.a.a((Activity) bVar.d, 6, bVar.e, bVar.a(addressItem, (Map<String, Object>) null), 1, com.sankuai.waimai.bussiness.order.base.a.a(bVar.b.p), (Map<String, Object>) null);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).ag.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.10
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e2339044acf88a5ce73aac36eed8d25c", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e2339044acf88a5ce73aac36eed8d25c") : Boolean.valueOf(g.this.u.g.r());
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).ak.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.11
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9e98fa4476b9789ffd7e1913466c3842", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9e98fa4476b9789ffd7e1913466c3842") : Boolean.valueOf(g.this.u.g.o());
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).ah.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.13
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "58d3160864262f83a11f847430276fe6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "58d3160864262f83a11f847430276fe6");
                } else {
                    g.this.u.g.p();
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).m.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.14
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6b37042f6a42ec0d5a0963cc59218868", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6b37042f6a42ec0d5a0963cc59218868");
                } else {
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(g.this.m(), "order_confirm_privacy_show_new_first", true);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aN.a(new com.meituan.android.cube.pga.action.b<i.c<Long, Integer>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.15
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.c<Long, Integer> cVar) {
                i.c<Long, Integer> cVar2 = cVar;
                Object[] objArr3 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "403b422cf2f705085e095bd220eda32b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "403b422cf2f705085e095bd220eda32b");
                } else {
                    g.this.u.g.a(cVar2.c.longValue(), cVar2.d.intValue());
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).W.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.16
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f094e707d7bf663ec28d0b7e028b3d89", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f094e707d7bf663ec28d0b7e028b3d89");
                }
                if (d.c.get("addressString") != null) {
                    return String.valueOf(d.c.get("addressString"));
                }
                return null;
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aA.b = new com.meituan.android.cube.pga.action.d<Integer>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.17
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Integer a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "29ec704cadd4cee0565740739c8b2f34", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "29ec704cadd4cee0565740739c8b2f34") : Integer.valueOf(g.this.u.g.q());
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).ao.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.18
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d92db906946ec86a69ea0707eb37bb18", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d92db906946ec86a69ea0707eb37bb18");
                }
                g.this.u.g.n();
                return null;
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).bl.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.19
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0601273b7a8f1e125ecaeb5918063c63", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0601273b7a8f1e125ecaeb5918063c63") : Integer.valueOf(r.a(String.valueOf(d.c.get("order_pay_type")), 2));
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aU.a(new com.meituan.android.cube.pga.action.b<String>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.20
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(String str) {
                String str2 = str;
                Object[] objArr3 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5acf96029f9991c3b67aa46a7363cc5a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5acf96029f9991c3b67aa46a7363cc5a");
                } else {
                    g.this.u.l.e = str2;
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aV.b = new com.meituan.android.cube.pga.action.d<Void>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.21
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e15def8636cd5e58ab02d745b6c064c6", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Void) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e15def8636cd5e58ab02d745b6c064c6");
                }
                g.h(g.this);
                return null;
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aB.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.22
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Void r11) {
                Object[] objArr3 = {r11};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e7125f5b3bb0b5bb32f780d8c9d4d1c2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e7125f5b3bb0b5bb32f780d8c9d4d1c2");
                } else {
                    d.b(false, false, "additional_bargain_list", new ArrayList());
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aM.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.24
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Void r19) {
                long j;
                int i;
                Object[] objArr3 = {r19};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ed28cc13139f7594e4befcb4e9dd3614", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ed28cc13139f7594e4befcb4e9dd3614");
                    return;
                }
                com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a aVar = g.this.u.n;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "679a1fcea131c096d9742a826b9d2ef8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "679a1fcea131c096d9742a826b9d2ef8");
                    return;
                }
                if (aVar.q.p.tablewareSettingsInfo.settingForAddress == 1) {
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.a aVar2 = aVar.q;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.a.o;
                    if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "46ed01262a39f7bf5820cd6fdce8f904", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "46ed01262a39f7bf5820cd6fdce8f904");
                    } else {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.a.o;
                        if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "1528107ade48e18e7d6bccc9f2b03ab3", RobustBitConfig.DEFAULT_VALUE)) {
                            j = ((Long) PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "1528107ade48e18e7d6bccc9f2b03ab3")).longValue();
                        } else {
                            long j2 = -1;
                            for (int i2 = 0; i2 < aVar2.p.businessTypeList.size(); i2++) {
                                BusinessType businessType = aVar2.p.businessTypeList.get(i2);
                                if (businessType.selected.longValue() == 1) {
                                    j2 = businessType.type.longValue();
                                }
                            }
                            aVar2.p.businessType = j2;
                            j = j2;
                        }
                        if (aVar2.p.tablewareSettingsInfo.settingForAddress == 1 && j == 0) {
                            i = 1;
                        } else {
                            i = (aVar2.p.tablewareSettingsInfo.settingForAddress == 1 && j == 1) ? 2 : 0;
                        }
                        aVar2.p.experimentType = i;
                    }
                }
                com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.c cVar = aVar.p;
                ExtendInfoModel extendInfoModel = aVar.q.p;
                Object[] objArr7 = {extendInfoModel};
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.c.a;
                if (PatchProxy.isSupport(objArr7, cVar, changeQuickRedirect7, false, "f8c0d5c81c7eb6da55a247028aedc3bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, cVar, changeQuickRedirect7, false, "f8c0d5c81c7eb6da55a247028aedc3bf");
                } else {
                    cVar.a(true, (Map<String, Object>) null, extendInfoModel);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).S.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.25
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Void r11) {
                Object[] objArr3 = {r11};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ad93bd9b6432a61197bc8d5f8fcd317c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ad93bd9b6432a61197bc8d5f8fcd317c");
                } else {
                    g.i(g.this);
                }
            }
        });
        com.meituan.android.cube.pga.common.b<Integer> bVar = ((com.sankuai.waimai.bussiness.order.confirm.a) F()).bo;
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = h.a;
        com.meituan.android.cube.pga.block.b bVar2 = null;
        bVar.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "19ebafdcbbe0d783cbfefface49074c8", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.action.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "19ebafdcbbe0d783cbfefface49074c8") : new h(this));
        com.meituan.android.cube.pga.common.b<Map<String, Object>> bVar3 = ((com.sankuai.waimai.bussiness.order.confirm.a) F()).an;
        Object[] objArr4 = {this};
        ChangeQuickRedirect changeQuickRedirect4 = i.a;
        bVar3.a(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "00c3c13980ecdab9839de307bcd12252", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.action.b) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "00c3c13980ecdab9839de307bcd12252") : new i(this));
        b((com.meituan.android.cube.pga.block.b) new com.sankuai.waimai.bussiness.order.confirm.pgablock.root.b((com.sankuai.waimai.bussiness.order.confirm.a) F()));
        Object[] objArr5 = {this, "drug_order_confirm_medicare_way_style_1"};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.platform.dynamic.d.a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "85cd6acc3105477260dac4889f84505e", RobustBitConfig.DEFAULT_VALUE)) {
            bVar2 = (com.meituan.android.cube.pga.block.b) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "85cd6acc3105477260dac4889f84505e");
        } else {
            com.meituan.android.cube.pga.dynamic.d a4 = com.sankuai.waimai.platform.dynamic.d.a("drug_order_confirm_medicare_way_style_1");
            if (a4 != 0) {
                bVar2 = a4.a((com.meituan.android.cube.pga.type.a) F());
            }
        }
        if (bVar2 != null) {
            b(bVar2);
            bVar2.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<m, Map<String, Object>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.26
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.c
                public final /* synthetic */ Map<String, Object> a(m mVar) {
                    m mVar2 = mVar;
                    Object[] objArr6 = {mVar2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4a8ab84e4b44083eaffccdb2b7d48a8b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4a8ab84e4b44083eaffccdb2b7d48a8b") : mVar2.c("wm_confirm_order_drug_medicare_way");
                }
            });
        }
        com.meituan.android.cube.pga.block.a a5 = com.sankuai.waimai.platform.dynamic.d.a(this, "drug_order_confirm_logic_block_style_1");
        if (a5 != null) {
            b((com.meituan.android.cube.pga.block.b) a5);
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b bVar4 = new com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.b((com.sankuai.waimai.bussiness.order.confirm.a) F(), (ViewStub) i().findViewById(R.id.submit_viewstub));
        bVar4.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<m, Map<String, Object>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.27
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.cube.pga.action.c
            public Map<String, Object> a(m mVar) {
                Object[] objArr6 = {mVar};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "11180da7c2b616739627111b5c33ff43", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "11180da7c2b616739627111b5c33ff43");
                }
                if (mVar != null) {
                    try {
                        SubmitInfo submitInfo = (SubmitInfo) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(com.sankuai.waimai.foundation.location.v2.d.a().toJson(mVar.c("wm_order_confirm_bottom_operate")), (Class<Object>) SubmitInfo.class);
                        if (submitInfo != null) {
                            if (submitInfo.preDecision == null || submitInfo.preDecision.productList == null || submitInfo.preDecision.productList.size() <= 0) {
                                ((a) g.this.g).b(60);
                            } else {
                                ((a) g.this.g).b(94);
                            }
                            return mVar.c("wm_order_confirm_bottom_operate");
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.imbase.log.a.a("OrderConfirmRockRootBlock", e);
                    }
                }
                return Collections.emptyMap();
            }
        });
        a((com.meituan.android.cube.pga.block.a) bVar4);
        this.J = (RecyclerView) i().findViewById(R.id.scroll_container);
        if (N()) {
            this.v = i().findViewById(R.id.bg_view);
            this.v.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.28
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "44ca0f43a06e54316396aad3b53e0105", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "44ca0f43a06e54316396aad3b53e0105");
                    } else {
                        g.this.l().finish();
                    }
                }
            });
            this.w = i().findViewById(R.id.content_view);
            this.K = i().findViewById(R.id.scroll_viewstub);
            this.L = (ImageView) i().findViewById(R.id.close_btn);
            this.K.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.29
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "fbe6fcd7765d80659c624b381ca2c8ee", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "fbe6fcd7765d80659c624b381ca2c8ee");
                    }
                }
            });
        }
        RecyclerView recyclerView = this.J;
        Object[] objArr6 = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect6 = r;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "fbda08eda129b3231e3efd82719be8dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "fbda08eda129b3231e3efd82719be8dd");
        } else if (recyclerView != null && O() && !N()) {
            ah.b(recyclerView, Integer.MIN_VALUE, com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a) + com.meituan.android.singleton.b.a.getResources().getDimensionPixelSize(R.dimen.actionbar_height), Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        RecyclerView recyclerView2 = this.J;
        Object[] objArr7 = {recyclerView2};
        ChangeQuickRedirect changeQuickRedirect7 = r;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "bc1c17e611edf2c1020a62fd2c9ba50c", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.sankuai.waimai.rocks.view.a) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "bc1c17e611edf2c1020a62fd2c9ba50c");
        } else {
            a.C1132a c1132a = new a.C1132a("waimai");
            c1132a.k = "order_confirm";
            c1132a.c = m();
            c1132a.q = (com.sankuai.waimai.rocks.view.block.c) F();
            c1132a.s = new com.sankuai.waimai.platform.rocks.b();
            c1132a.f = recyclerView2;
            c1132a.m = true;
            c1132a.o = true;
            c1132a.n = true;
            c1132a.y = false;
            c1132a.r = this.t;
            c1132a.l = this.z;
            c1132a.g = this.B;
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = r;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "0a4e8388091fb2c3935019d0f50f13c1", RobustBitConfig.DEFAULT_VALUE)) {
                dVar = (com.sankuai.waimai.rocks.view.mach.d) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "0a4e8388091fb2c3935019d0f50f13c1");
            } else {
                final com.sankuai.waimai.bussiness.order.base.mach.a aVar = new com.sankuai.waimai.bussiness.order.base.mach.a("c_ykhs39e", AppUtil.generatePageInfoKey(l()));
                dVar = new com.sankuai.waimai.rocks.view.mach.d(new d.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.39
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.rocks.view.mach.d.a
                    public final Mach.a a() {
                        Object[] objArr9 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect9 = a;
                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "af196644d6abc08f73757b13e1baa169", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Mach.a) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "af196644d6abc08f73757b13e1baa169");
                        }
                        Mach.a aVar2 = new Mach.a();
                        aVar2.b = g.this.m();
                        aVar2.l = new c(g.this.l());
                        aVar2.e = new com.sankuai.waimai.mach.c() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.39.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.mach.c
                            public final void a(c.a aVar3, com.sankuai.waimai.mach.k kVar) {
                                Object[] objArr10 = {aVar3, kVar};
                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "9855615cc6ed8958cd0b550cefbec050", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "9855615cc6ed8958cd0b550cefbec050");
                                } else {
                                    WmMachImageLoaderUtil.a(aVar3, kVar);
                                }
                            }
                        };
                        aVar2.d = aVar;
                        return aVar2.a(new WebpImageTagProcessor()).a(new DynamicTagProcessor()).a(new ScrollerTagProcessor()).a(new SwiperTagProcessor()).a(new RocksOrderNativeModule(g.this.m())).a(new HttpJSNativeMethod() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.39.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
                            public final void httpRequest(String str, Map<String, String> map, rx.j<ap> jVar) {
                                Object[] objArr10 = {str, map, jVar};
                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "3e994b6fb229bad0d04c0d57f86e4a17", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "3e994b6fb229bad0d04c0d57f86e4a17");
                                } else {
                                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((HttpJSNativeMethod.JSRequest) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) HttpJSNativeMethod.JSRequest.class)).get(str, map), jVar, g.this.H);
                                }
                            }
                        }).a(new com.sankuai.waimai.platform.mach.statistics.d(g.this.m()));
                    }
                });
            }
            c1132a.d = dVar;
            c1132a.w = new Mach.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.38
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.Mach.d
                public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
                    Object[] objArr9 = {str, map};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "a4b563e5b3857232440c83ebe506159b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "a4b563e5b3857232440c83ebe506159b");
                        return;
                    }
                    g.this.u.a(str, map);
                    if (TextUtils.equals(str, "std_trigger_expose_event")) {
                        g.b(g.this, map);
                    }
                }
            };
            c1132a.e = new c.b() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.37
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.view.mach.c.b
                public final void a(com.sankuai.waimai.mach.recycler.c cVar) {
                    Object[] objArr9 = {cVar};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "7997ab3058508001b1f7a90a9f692c0d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "7997ab3058508001b1f7a90a9f692c0d");
                    } else if (cVar != null) {
                        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(cVar, "activity_result_event");
                        String str = cVar.j;
                        g.this.R.put(str, cVar);
                        if (TextUtils.equals(str, "wm_confirm_order_mt_delivery")) {
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(cVar, "address_label_icon_event");
                        } else if (TextUtils.equals(str, "wm_confirm_order_self_delivery")) {
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(cVar, "receive_phone_code_options_action");
                        } else if (TextUtils.equals(str, "wm_confirm_order_extend_information_mach")) {
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(cVar, "no_product_reminds_update_event");
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(cVar, "remark_update_bubble_event");
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(cVar, "dinners_update_event");
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(cVar, "remark_update_event");
                        } else if (TextUtils.equals(str, "wm_confirm_order_food_flower_cake")) {
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(cVar, "phone_inter_code_event");
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(cVar, "phone_content_event");
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(cVar, "cake_content_event");
                        }
                    }
                }
            };
            a2 = c1132a.a();
        }
        this.s = a2;
        final int e = O() ? com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a) : 0;
        final int dimensionPixelSize = com.meituan.android.singleton.b.a.getResources().getDimensionPixelSize(R.dimen.actionbar_height);
        this.J.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.30
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView3, int i) {
                Object[] objArr9 = {recyclerView3, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "ba54fc693179f9dae4daf26896ecc9dd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "ba54fc693179f9dae4daf26896ecc9dd");
                } else {
                    super.onScrollStateChanged(recyclerView3, i);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
            @Override // android.support.v7.widget.RecyclerView.k
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onScrolled(android.support.v7.widget.RecyclerView r11, int r12, int r13) {
                /*
                    Method dump skipped, instructions count: 270
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.AnonymousClass30.onScrolled(android.support.v7.widget.RecyclerView, int, int):void");
            }
        });
        this.J.setItemViewCacheSize(10);
        if (N()) {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.actionbar.b bVar5 = new com.sankuai.waimai.bussiness.order.confirm.pgablock.actionbar.b((com.sankuai.waimai.bussiness.order.confirm.a) F());
            bVar5.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<m, Map<String, Object>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.31
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.cube.pga.action.c
                public Map<String, Object> a(m mVar) {
                    Object[] objArr9 = {mVar};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "e34d1a88478f4344742a821e573e55ad", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "e34d1a88478f4344742a821e573e55ad");
                    }
                    if (mVar != null) {
                        try {
                            return mVar.c("wm_order_confirm_action_bar");
                        } catch (Exception e2) {
                            com.sankuai.waimai.imbase.log.a.a("OrderConfirmRockRootBlock", e2);
                        }
                    }
                    return Collections.emptyMap();
                }
            });
            a(bVar5, R.id.actionbar_viewstub);
        } else {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.actionbar.a aVar2 = new com.sankuai.waimai.bussiness.order.confirm.pgablock.actionbar.a((com.sankuai.waimai.bussiness.order.confirm.a) F(), (ViewStub) i().findViewById(R.id.actionbar_viewstub));
            aVar2.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<m, Map<String, Object>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.32
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.cube.pga.action.c
                public Map<String, Object> a(m mVar) {
                    Object[] objArr9 = {mVar};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "90d780b7eca02cee49174a61a4c90eb7", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "90d780b7eca02cee49174a61a4c90eb7");
                    }
                    if (mVar != null) {
                        try {
                            return mVar.c("wm_order_confirm_action_bar");
                        } catch (Exception e2) {
                            com.sankuai.waimai.imbase.log.a.a("OrderConfirmRockRootBlock", e2);
                        }
                    }
                    return Collections.emptyMap();
                }
            });
            a((com.meituan.android.cube.pga.block.a) aVar2);
        }
        a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.bussiness.order.confirm.pgablock.collectfood.a((com.sankuai.waimai.bussiness.order.confirm.a) F(), (ViewStub) i().findViewById(R.id.layout_collect_food_viewstub)));
        com.meituan.android.cube.pga.block.a a6 = com.sankuai.waimai.platform.dynamic.d.a(this, "wm_confirm_order_drug_risk_info_style_1");
        if (a6 != null) {
            a6.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<m, Map<String, Object>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.33
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.c
                public final /* synthetic */ Map<String, Object> a(m mVar) {
                    m mVar2 = mVar;
                    Object[] objArr9 = {mVar2};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "47d68554efa26e5fcab95cb54c0eeb31", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "47d68554efa26e5fcab95cb54c0eeb31");
                    }
                    if (mVar2 != null) {
                        return mVar2.c("wm_confirm_order_drug_risk_info");
                    }
                    return null;
                }
            });
            a(a6, R.id.drug_risk_place_holder_viewstub);
        }
    }

    public static /* synthetic */ void a(g gVar, Integer num) {
        Object[] objArr = {gVar, num};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c01abe2c1318ff6f618efa2858cd539", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c01abe2c1318ff6f618efa2858cd539");
            return;
        }
        switch (num.intValue()) {
            case 60:
            case 61:
            case 63:
                d.b(false, true, "no_product_reminds_selected", 1);
            case 62:
                Object obj = d.c.get("no_product_reminds_selected");
                d.b(false, true, "no_product_reminds_selected", Integer.valueOf(obj instanceof Number ? ((Number) obj).intValue() : 1));
                Object obj2 = d.c.get("foodlist");
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int c = com.sankuai.waimai.foundation.utils.b.c(list);
                    for (int i = 0; i < c; i++) {
                        Object a2 = com.sankuai.waimai.foundation.utils.b.a(list, i);
                        if (a2 instanceof Map) {
                            ((Map) a2).put("backup_food_list", null);
                        }
                    }
                }
                d.a("foodlist", obj2);
                break;
        }
        ((com.sankuai.waimai.bussiness.order.confirm.a) gVar.F()).ab.a((com.meituan.android.cube.pga.common.b<Integer>) null);
    }

    public static /* synthetic */ void a(g gVar, Map map) {
        Object[] objArr = {gVar, map};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6ff4750ed8d3a7f6ceb46a8ce577541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6ff4750ed8d3a7f6ceb46a8ce577541");
        } else if (map != null) {
            try {
                map.remove("no_product_reminds_selected");
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = r;
                if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "5fe91af5dec2f5300c8535e193e7a9fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "5fe91af5dec2f5300c8535e193e7a9fe");
                    return;
                }
                List list = (List) map.get("foodlist");
                int c = com.sankuai.waimai.foundation.utils.b.c(list);
                for (int i = 0; i < c; i++) {
                    OrderFoodInput orderFoodInput = (OrderFoodInput) com.sankuai.waimai.foundation.utils.b.a(list, i);
                    if (orderFoodInput != null) {
                        orderFoodInput.backupFoodList = null;
                    }
                }
            } catch (Exception e) {
                com.sankuai.waimai.imbase.log.a.a(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends com.meituan.android.cube.pga.view.a {
        public static ChangeQuickRedirect d;
        private View f;
        private int g;
        private int h;

        public a(Context context) {
            super(context);
            Object[] objArr = {g.this, context};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a00dc855f4fc445cddaff514329cc848", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a00dc855f4fc445cddaff514329cc848");
            } else if (com.sankuai.waimai.platform.model.c.a().b() == 1) {
                b(114);
            }
        }

        @Override // com.meituan.android.cube.pga.view.a
        public final void b() {
            int dimensionPixelSize;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab077f6c3dd3494780b0a62d7146bc51", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab077f6c3dd3494780b0a62d7146bc51");
                return;
            }
            super.b();
            this.f = this.b.findViewById(R.id.bg_head_title);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c17a42c33936d790af7e77128db6ac0", RobustBitConfig.DEFAULT_VALUE)) {
                dimensionPixelSize = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c17a42c33936d790af7e77128db6ac0")).intValue();
            } else {
                dimensionPixelSize = g.this.m().getResources().getDimensionPixelSize(R.dimen.actionbar_height);
                int e = com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a);
                if (Build.VERSION.SDK_INT >= 23) {
                    dimensionPixelSize += e;
                }
            }
            this.g = dimensionPixelSize;
            this.h = g.this.N() ? this.c.getResources().getDimensionPixelOffset(R.dimen.wm_order_confirm_new_header_bg_height) : this.c.getResources().getDimensionPixelOffset(R.dimen.wm_order_confirm_header_bg_height);
            ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
            layoutParams.height = this.h + this.g;
            this.f.setLayoutParams(layoutParams);
        }

        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acedf1194c54d430d42a5b15d4361526", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acedf1194c54d430d42a5b15d4361526");
            } else if (i < this.c.getResources().getDimensionPixelOffset(R.dimen.wm_order_confirm_header_bg_height) * (-1)) {
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
                marginLayoutParams.topMargin = i;
                this.f.setLayoutParams(marginLayoutParams);
            }
        }

        public final void b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d341f568b5eb77f4bec9782234d6a4c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d341f568b5eb77f4bec9782234d6a4c7");
                return;
            }
            View findViewById = this.b.findViewById(R.id.submit_view_place_holder);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = com.sankuai.waimai.foundation.utils.g.a(this.c, i);
            findViewById.setLayoutParams(layoutParams);
        }

        @Override // com.meituan.android.cube.pga.view.a
        public final int d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a59d2b8553d81749f5d3bf7fcb0c955", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a59d2b8553d81749f5d3bf7fcb0c955")).intValue() : g.this.N() ? R.layout.wm_order_confirm_order_new_rocks_root : R.layout.wm_order_confirm_order_rocks_root;
        }
    }

    private static boolean O() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public final void a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67b662bccebc1baba9b128dfefa232f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67b662bccebc1baba9b128dfefa232f9");
            return;
        }
        if (N()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
            marginLayoutParams.topMargin = com.sankuai.waimai.foundation.utils.g.a(m(), mVar.e > 1 ? 50.0f : 30.0f);
            this.K.setLayoutParams(marginLayoutParams);
        }
        try {
            this.u.a(mVar);
        } catch (Exception unused) {
        }
        this.I = mVar;
        this.Q = new j(m(), ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aH_(), ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aI_(), mVar, (com.sankuai.waimai.bussiness.order.confirm.a) F());
        if (this.M) {
            b(((com.sankuai.waimai.bussiness.order.confirm.a) F()).aI_());
            c(((com.sankuai.waimai.bussiness.order.confirm.a) F()).aI_());
        }
        this.Q.a();
    }

    public final void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea914aee7c203cc09fbc72446472589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea914aee7c203cc09fbc72446472589");
            return;
        }
        this.C.b();
        this.s.a((RocksServerModel) this.Q.b, false, false, new a.c() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.40
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.a.c
            public final void a(List<com.sankuai.waimai.rocks.node.a> list) {
            }

            /* JADX WARN: Type inference failed for: r2v30 */
            /* JADX WARN: Type inference failed for: r2v31, types: [boolean, byte] */
            /* JADX WARN: Type inference failed for: r2v39 */
            @Override // com.sankuai.waimai.rocks.view.a.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e093ffd3e3b2d32d2bb51e2e3146b0a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e093ffd3e3b2d32d2bb51e2e3146b0a9");
                    return;
                }
                g.this.u.j.a();
                g.this.u.j.d = g.this.Q.b.a("wm_confirm_order_food_flower_cake");
                if (g.this.I.b("wm_confirm_order_wm_card").size() > 0) {
                    g.this.E.a(g.this.I.b, false);
                }
                if (g.this.I.b("wm-order-confirm-marketing-ttsq-tying").size() > 0) {
                    g.this.F.a(g.this.I.b, true);
                }
                if (g.this.I.b("drug_order_confirm_commit_member").size() > 0) {
                    final com.sankuai.waimai.bussiness.order.confirm.pgablock.drugcard.rock.a aVar = g.this.G;
                    Map<String, Object> map = g.this.I.b;
                    Object[] objArr3 = {map};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.confirm.pgablock.drugcard.rock.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "6765676908c568656f157e21ffcc7777", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "6765676908c568656f157e21ffcc7777");
                    } else {
                        String json = com.sankuai.waimai.mach.utils.b.a().toJson(map);
                        Object[] objArr4 = {json};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.confirm.pgablock.drugcard.rock.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "d6cb683f08e331f6d15c1919dca72f38", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "d6cb683f08e331f6d15c1919dca72f38");
                        } else {
                            try {
                                if (!TextUtils.isEmpty(json)) {
                                    JSONObject jSONObject = new JSONObject(json);
                                    if (jSONObject.optJSONObject("biz_client_data_map") != null && jSONObject.optJSONObject("biz_client_data_map").optJSONObject("medical_member_tied") != null) {
                                        aVar.d = com.sankuai.waimai.bussiness.order.confirm.model.b.a(jSONObject.optJSONObject("biz_client_data_map").optJSONObject("medical_member_tied"));
                                    }
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        if (aVar.d != null && aVar.d.j != null) {
                            if (!(d.c.containsKey("have_show_dialog") ? ((Boolean) d.c.get("have_show_dialog")).booleanValue() : false)) {
                                d.a("have_show_dialog", Boolean.TRUE);
                                String str = aVar.d.j.c;
                                if (TextUtils.isEmpty(str)) {
                                    str = aVar.b.getString(R.string.wm_order_confirm_drug_card_alert_content);
                                }
                                final String str2 = "JUMP_SELECT_USER_COUPON";
                                String string = aVar.b.getString(R.string.wm_order_confirm_drug_card_alert_cancel);
                                String string2 = aVar.b.getString(R.string.wm_order_confirm_drug_card_alert_confirm);
                                ArrayList<b.a.C0893a> arrayList = aVar.d.j.d;
                                if (arrayList != null && arrayList.size() == 2) {
                                    b.a.C0893a c0893a = null;
                                    b.a.C0893a c0893a2 = null;
                                    for (int i = 0; i < 2; i++) {
                                        b.a.C0893a c0893a3 = arrayList.get(i);
                                        if (c0893a3.b == 0) {
                                            c0893a = c0893a3;
                                        } else if (c0893a3.b == 1) {
                                            c0893a2 = c0893a3;
                                        }
                                    }
                                    if (c0893a != null && c0893a2 != null) {
                                        if (!TextUtils.isEmpty(c0893a.c)) {
                                            string = c0893a.c;
                                        }
                                        if (!TextUtils.isEmpty(c0893a2.c)) {
                                            string2 = c0893a2.c;
                                        }
                                        str2 = c0893a2.d;
                                    }
                                }
                                JudasManualManager.b("b_waimai_k4lhhwxs_mv").a("c_ykhs39e").a(aVar.b).a();
                                new RooAlertDialog.a(new ContextThemeWrapper(aVar.b, 2131558962)).b(str).a(string2, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.drugcard.rock.a.2
                                    public static ChangeQuickRedirect a;

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        Object[] objArr5 = {dialogInterface, Integer.valueOf(i2)};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cef5fdd2f44eb100456bcb1008504cf5", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cef5fdd2f44eb100456bcb1008504cf5");
                                            return;
                                        }
                                        JudasManualManager.a("b_waimai_k4lhhwxs_mc").a("c_ykhs39e").a("btn_type", 1).a(aVar.b).a();
                                        dialogInterface.dismiss();
                                        if (str2 == null || !str2.equals("JUMP_SELECT_USER_COUPON")) {
                                            return;
                                        }
                                        aVar.c.aW.a((com.meituan.android.cube.pga.common.b<String>) "");
                                    }
                                }).b(string, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.drugcard.rock.a.1
                                    public static ChangeQuickRedirect a;

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        Object[] objArr5 = {dialogInterface, Integer.valueOf(i2)};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "24119355668e22bd0acf2b188e886a68", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "24119355668e22bd0acf2b188e886a68");
                                            return;
                                        }
                                        JudasManualManager.a("b_waimai_k4lhhwxs_mc").a("c_ykhs39e").a("btn_type", 0).a(aVar.b).a();
                                        dialogInterface.dismiss();
                                    }
                                }).b();
                            }
                        }
                    }
                }
                final g gVar = g.this;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = g.r;
                if (PatchProxy.isSupport(objArr5, gVar, changeQuickRedirect5, false, "164a0e1d39665eab270df7defe4d8a09", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, gVar, changeQuickRedirect5, false, "164a0e1d39665eab270df7defe4d8a09");
                } else {
                    gVar.i().postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.41
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "10ac6c24a1e2bdfb0769701187903271", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "10ac6c24a1e2bdfb0769701187903271");
                            } else {
                                g.this.B.aq_();
                            }
                        }
                    }, 300L);
                }
                com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.a aVar2 = g.this.D;
                m mVar = g.this.I;
                Object[] objArr6 = {mVar};
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.a.a;
                if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "27bcf88b16d9b4633607c19035d3470c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "27bcf88b16d9b4633607c19035d3470c");
                } else {
                    Map<String, Object> map2 = mVar.b;
                    long a2 = r.a(String.valueOf(map2.get("wm_poi_id")), 0L);
                    String b2 = com.sankuai.waimai.bussiness.order.base.utils.i.b(String.valueOf(map2.get(FoodDetailNetWorkPreLoader.URI_POI_STR)));
                    if (aa.a(b2)) {
                        b2 = "";
                    }
                    com.sankuai.waimai.platform.domain.core.poi.b.a(a2, b2);
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.a aVar3 = new com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.a();
                    aVar3.b(mVar.a("wm_confirm_order_extend_information_mach"));
                    CallbackInfo callbackInfo = (CallbackInfo) com.sankuai.waimai.alita.core.utils.k.a().fromJson(com.sankuai.waimai.alita.core.utils.k.a().toJson(map2.get("callback_info")), (Class<Object>) CallbackInfo.class);
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.c a3 = aVar3.a(a2, b2);
                    a3.e = callbackInfo != null ? callbackInfo.remarkTagCallbackInfo : "";
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.b bVar = aVar2.c;
                    Object[] objArr7 = {mVar, a3};
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.b.a;
                    if (PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "39c344247660e0355e6a2a05bcbac35b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "39c344247660e0355e6a2a05bcbac35b");
                    } else {
                        int a4 = mVar.a("wm_confirm_order_extend_information_mach");
                        final com.sankuai.waimai.bussiness.order.confirm.pgablock.remarkinfo.a aVar4 = bVar.b;
                        Object[] objArr8 = {a3, Integer.valueOf(a4)};
                        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.bussiness.order.confirm.pgablock.remarkinfo.a.a;
                        if (PatchProxy.isSupport(objArr8, aVar4, changeQuickRedirect8, false, "400e2ab19b98d0650b43b2594d752f2e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, aVar4, changeQuickRedirect8, false, "400e2ab19b98d0650b43b2594d752f2e");
                        } else {
                            aVar4.g = a3 != null ? a3.f : null;
                            aVar4.h = a3 != null ? a3.h : null;
                            aVar4.j = a4;
                            if (aVar4.f == null && a4 > 0) {
                                aVar4.f = (TextView) aVar4.b.findViewById(R.id.txt_remark_remind);
                                aVar4.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.remarkinfo.a.1
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Object[] objArr9 = {view};
                                        ChangeQuickRedirect changeQuickRedirect9 = a;
                                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "e29114beabbcf653dc8ab2ffbb8168be", 4611686018427387906L)) {
                                            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "e29114beabbcf653dc8ab2ffbb8168be");
                                            return;
                                        }
                                        final RecyclerView recyclerView = aVar4.c.R.a().b;
                                        recyclerView.postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.remarkinfo.a.1.1
                                            public static ChangeQuickRedirect a;

                                            {
                                                AnonymousClass1.this = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Object[] objArr10 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "a974f835d9b0e215eb2d9ce7bbf478d5", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "a974f835d9b0e215eb2d9ce7bbf478d5");
                                                    return;
                                                }
                                                recyclerView.smoothScrollToPosition(aVar4.j);
                                                a.a(aVar4);
                                                aVar4.i = true;
                                            }
                                        }, 200L);
                                    }
                                });
                            }
                        }
                    }
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.additionalbargain.c cVar = new com.sankuai.waimai.bussiness.order.crossconfirm.block.additionalbargain.c();
                    cVar.a = false;
                    cVar.b = (AdditionalBargain) com.sankuai.waimai.alita.core.utils.k.a().fromJson(com.sankuai.waimai.alita.core.utils.k.a().toJson(mVar.a("wm_confirm_order_additional_bargain")), (Class<Object>) AdditionalBargain.class);
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.additionalbargain.a aVar5 = aVar2.e;
                    final com.sankuai.waimai.bussiness.order.confirm.a aVar6 = aVar2.h;
                    Object[] objArr9 = {mVar, aVar6, cVar};
                    ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.bussiness.order.confirm.pgablock.additionalbargain.a.a;
                    if (PatchProxy.isSupport(objArr9, aVar5, changeQuickRedirect9, false, "b0dbf45ea3db4f478ae70d8c35657ade", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, aVar5, changeQuickRedirect9, false, "b0dbf45ea3db4f478ae70d8c35657ade");
                    } else {
                        int a5 = mVar.a("wm_confirm_order_additional_bargain");
                        final com.sankuai.waimai.bussiness.order.confirm.pgablock.additionalbargain.b bVar2 = aVar5.b;
                        Object[] objArr10 = {cVar, aVar6, Integer.valueOf(a5)};
                        ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.bussiness.order.confirm.pgablock.additionalbargain.b.a;
                        if (PatchProxy.isSupport(objArr10, bVar2, changeQuickRedirect10, false, "14ef71fe7e4c43055c72c52ef50edeec", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, bVar2, changeQuickRedirect10, false, "14ef71fe7e4c43055c72c52ef50edeec");
                        } else {
                            bVar2.h = cVar.b;
                            bVar2.i = aVar6;
                            if (a5 > 0) {
                                bVar2.j = a5;
                                if (bVar2.b == null) {
                                    bVar2.b = (LinearLayout) bVar2.g.findViewById(R.id.layout_plus_remind);
                                    bVar2.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.additionalbargain.b.1
                                        public static ChangeQuickRedirect a;

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Object[] objArr11 = {view};
                                            ChangeQuickRedirect changeQuickRedirect11 = a;
                                            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "ff312fa97ff7be6a01f27b19fe47f1a7", 4611686018427387906L)) {
                                                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "ff312fa97ff7be6a01f27b19fe47f1a7");
                                                return;
                                            }
                                            JudasManualManager.a("b_waimai_6oo7xyha_mc").a("c_ykhs39e").a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(aVar6.aH_(), aVar6.aI_())).a("order_business_type", aVar6.H.a().intValue()).a(bVar2.g).a();
                                            bVar2.f = false;
                                            bVar2.b.setVisibility(8);
                                            final RecyclerView recyclerView = bVar2.i.R.a().b;
                                            recyclerView.postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.additionalbargain.b.1.1
                                                public static ChangeQuickRedirect a;

                                                {
                                                    AnonymousClass1.this = this;
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Object[] objArr12 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect12 = a;
                                                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "5599b8b7631af2e7918ffb5b25dafdd2", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "5599b8b7631af2e7918ffb5b25dafdd2");
                                                    } else {
                                                        recyclerView.smoothScrollToPosition(bVar2.j);
                                                    }
                                                }
                                            }, 200L);
                                        }
                                    });
                                }
                                if (bVar2.c == null) {
                                    bVar2.c = (TextView) bVar2.g.findViewById(R.id.txt_plus_price);
                                }
                                if (bVar2.d == null) {
                                    bVar2.d = (TextView) bVar2.g.findViewById(R.id.txt_plus_remind);
                                }
                            }
                        }
                    }
                    String privacyGuideDesc = ((ServiceGuaranteeInfo) com.sankuai.waimai.alita.core.utils.k.a().fromJson(com.sankuai.waimai.alita.core.utils.k.a().toJson(mVar.a("wm_confirm_order_service_guarantee")), (Class<Object>) ServiceGuaranteeInfo.class)).getPrivacyGuideDesc();
                    boolean z = !mVar.b("wm_confirm_order_time_insurance").isEmpty() ? 1 : 0;
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.serviceguarantee.a aVar7 = aVar2.d;
                    Object[] objArr11 = {privacyGuideDesc, mVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.bussiness.order.confirm.pgablock.serviceguarantee.a.a;
                    if (PatchProxy.isSupport(objArr11, aVar7, changeQuickRedirect11, false, "cb332a516a20c6c49aadb6c2b5550b01", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, aVar7, changeQuickRedirect11, false, "cb332a516a20c6c49aadb6c2b5550b01");
                    } else {
                        aVar7.c = (ViewGroup) aVar7.j.aI.a().b;
                        aVar7.h = aVar7.j.R.a().b;
                        aVar7.k = z;
                        aVar7.i = mVar.a("wm_confirm_order_service");
                        aVar7.b = privacyGuideDesc;
                    }
                    String json2 = com.sankuai.waimai.alita.core.utils.k.a().toJson(mVar.b.get("biz_client_data_map"));
                    Map<String, Object> c = mVar.c("wm_order_confirm_bottom_operate");
                    ?? r2 = (!c.containsKey("submit_tip_info") || TextUtils.isEmpty(c.get("submit_tip_info").toString())) ? 0 : 1;
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.b bVar3 = aVar2.f;
                    Object[] objArr12 = {json2, Byte.valueOf((byte) r2), mVar};
                    ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.b.a;
                    if (PatchProxy.isSupport(objArr12, bVar3, changeQuickRedirect12, false, "7ae7eba12ad74f5393e58291189012f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, bVar3, changeQuickRedirect12, false, "7ae7eba12ad74f5393e58291189012f5");
                    } else {
                        int a6 = mVar.a("wm_confirm_order_wm_card");
                        String str3 = "wm_confirm_order_wm_card";
                        try {
                            JSONObject jSONObject2 = new JSONObject(json2);
                            if (jSONObject2.optJSONObject("member_tied") != null || jSONObject2.optJSONObject("magic_coupon_tied") != null) {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("member_tied");
                                if (optJSONObject == null) {
                                    optJSONObject = jSONObject2.optJSONObject("magic_coupon_tied");
                                    a6 = mVar.a("wm-order-confirm-marketing-ttsq-tying");
                                    str3 = "wm-order-confirm-marketing-ttsq-tying";
                                }
                                com.sankuai.waimai.bussiness.order.confirm.model.b a7 = com.sankuai.waimai.bussiness.order.confirm.model.b.a(optJSONObject);
                                bVar3.b.e = mVar.b(str3).containsKey("show") ? ((Boolean) mVar.b(str3).get("show")).booleanValue() : false;
                                final com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.a aVar8 = bVar3.b;
                                Object[] objArr13 = {a7, Byte.valueOf((byte) r2), Integer.valueOf(a6)};
                                ChangeQuickRedirect changeQuickRedirect13 = com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.a.a;
                                if (PatchProxy.isSupport(objArr13, aVar8, changeQuickRedirect13, false, "3db3b4ecd8c84005dd4cae8299b418d1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr13, aVar8, changeQuickRedirect13, false, "3db3b4ecd8c84005dd4cae8299b418d1");
                                } else {
                                    aVar8.g = a7;
                                    aVar8.j = r2;
                                    aVar8.k = a6;
                                    if (aVar8.b == null) {
                                        aVar8.b = (ViewGroup) aVar8.h.findViewById(R.id.layout_vip_float_guide);
                                        aVar8.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.a.1
                                            public static ChangeQuickRedirect a;

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i2 = 1;
                                                Object[] objArr14 = {view};
                                                ChangeQuickRedirect changeQuickRedirect14 = a;
                                                if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "437b0f967d2da01160fafd61ab15fff1", 4611686018427387906L)) {
                                                    PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "437b0f967d2da01160fafd61ab15fff1");
                                                    return;
                                                }
                                                aVar8.e();
                                                aVar8.f();
                                                aVar8.b.setVisibility(8);
                                                final RecyclerView recyclerView = aVar8.f.R.a().b;
                                                recyclerView.postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.a.1.1
                                                    public static ChangeQuickRedirect a;

                                                    {
                                                        AnonymousClass1.this = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Object[] objArr15 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect15 = a;
                                                        if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "e159cf09086d217068fe210b52d33413", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "e159cf09086d217068fe210b52d33413");
                                                        } else {
                                                            recyclerView.smoothScrollToPosition(aVar8.k);
                                                        }
                                                    }
                                                }, 200L);
                                                if (aVar8.g == null || !aVar8.g.g) {
                                                    return;
                                                }
                                                JudasManualManager.a a8 = JudasManualManager.a("b_waimai_8pa7jgyx_mc").a("user_buy_status", aVar8.g.i).a("intelligent_doc", aVar8.g.b);
                                                if (aVar8.g.k == 31) {
                                                    i2 = 2;
                                                } else if (aVar8.g.k == 13) {
                                                    i2 = 4;
                                                }
                                                a8.a("cate_id", i2).a("c_ykhs39e").a(aVar8.i).a();
                                            }
                                        });
                                    }
                                    if (aVar8.c == null) {
                                        aVar8.c = (TextView) aVar8.h.findViewById(R.id.text_guide_tips);
                                    }
                                    if (aVar8.d == null) {
                                        aVar8.d = (ImageView) aVar8.h.findViewById(R.id.img_guide);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                            bVar3.b.e = false;
                        }
                    }
                }
                com.sankuai.waimai.platform.utils.l.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.40.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        List<com.sankuai.waimai.bussiness.order.confirm.helper.d> list;
                        Object[] objArr14 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect14 = a;
                        if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "6b7ece8e9aece159b9b086a099acdbda", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "6b7ece8e9aece159b9b086a099acdbda");
                            return;
                        }
                        final com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.b bVar4 = new com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.b((com.sankuai.waimai.bussiness.order.confirm.a) g.this.F());
                        com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.a aVar9 = g.this.D;
                        Object[] objArr15 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect15 = com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.a.a;
                        if (PatchProxy.isSupport(objArr15, aVar9, changeQuickRedirect15, false, "9b537d27b30b1d6c27f73c3a9f8a7e46", RobustBitConfig.DEFAULT_VALUE)) {
                            list = (List) PatchProxy.accessDispatch(objArr15, aVar9, changeQuickRedirect15, false, "9b537d27b30b1d6c27f73c3a9f8a7e46");
                        } else {
                            aVar9.b.clear();
                            aVar9.b.add(aVar9.c.b);
                            aVar9.b.add(aVar9.d.l);
                            if (com.sankuai.waimai.platform.model.c.a().b() != 1) {
                                aVar9.b.add(aVar9.e.b);
                                aVar9.b.add(aVar9.f.b);
                            }
                            list = aVar9.b;
                        }
                        Object[] objArr16 = {list};
                        ChangeQuickRedirect changeQuickRedirect16 = com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.b.r;
                        if (PatchProxy.isSupport(objArr16, bVar4, changeQuickRedirect16, false, "2ee52d94c244e40a64af69b1aabc928b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr16, bVar4, changeQuickRedirect16, false, "2ee52d94c244e40a64af69b1aabc928b");
                        } else {
                            bVar4.s.clear();
                            bVar4.s = list;
                            Collections.sort(bVar4.s, new Comparator<com.sankuai.waimai.bussiness.order.confirm.helper.d>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.b.2
                                public static ChangeQuickRedirect a;

                                @Override // java.util.Comparator
                                public final /* synthetic */ int compare(com.sankuai.waimai.bussiness.order.confirm.helper.d dVar, com.sankuai.waimai.bussiness.order.confirm.helper.d dVar2) {
                                    com.sankuai.waimai.bussiness.order.confirm.helper.d dVar3 = dVar;
                                    com.sankuai.waimai.bussiness.order.confirm.helper.d dVar4 = dVar2;
                                    Object[] objArr17 = {dVar3, dVar4};
                                    ChangeQuickRedirect changeQuickRedirect17 = a;
                                    return PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "f1ae8fa1041965dcb55d445e4da4cfe1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "f1ae8fa1041965dcb55d445e4da4cfe1")).intValue() : dVar3.d() - dVar4.d();
                                }
                            });
                            bVar4.M();
                        }
                        g.this.a((com.meituan.android.cube.pga.block.a) bVar4);
                    }
                }, 100, "float_layer");
            }

            @Override // com.sankuai.waimai.rocks.view.a.c
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15ec63bcf5ffbd0efc17a9962fa04fc6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15ec63bcf5ffbd0efc17a9962fa04fc6");
                } else {
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_confirm_rocks_view").b("99").c("提单页面加载失败_页面渲染失败").b(true).b());
                }
            }
        });
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5084dc1f34dbc5b96229c1d41d502804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5084dc1f34dbc5b96229c1d41d502804");
            return;
        }
        SubmitOrderManager submitOrderManager = SubmitOrderManager.getInstance();
        HashMap<Long, String> cautionMap = submitOrderManager.getCautionMap();
        String str2 = "";
        if (cautionMap != null && cautionMap.containsKey(str)) {
            str2 = cautionMap.get(str);
        }
        submitOrderManager.setCaution(null);
        submitOrderManager.setCautionMap(null);
        d.a("remark", str2);
        d.b(false, false, "caution", str2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.sankuai.waimai.bussiness.order.confirm.cache.a.a().a(str, str2);
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7ce214bfd7e70cf932f36e137663c36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7ce214bfd7e70cf932f36e137663c36");
            return;
        }
        String a2 = this.Q.a(str);
        d.a("remark", aa.a(a2) ? "" : a2);
        d.b(false, false, "caution", a2);
    }

    @Override // com.meituan.android.cube.core.f
    public final void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1927c238a7035f8a268bd1377d6d075c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1927c238a7035f8a268bd1377d6d075c");
            return;
        }
        super.aX_();
        if (this.u != null) {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a aVar = this.u;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a.c;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9d50ad6aca5e35a5faf60e1ed4254e14", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9d50ad6aca5e35a5faf60e1ed4254e14");
            } else if (aVar.g != null) {
                aVar.g.t();
            }
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void aR_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2391ea92f59d4b8b98b06acae1f2de41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2391ea92f59d4b8b98b06acae1f2de41");
            return;
        }
        super.aR_();
        if (this.N && N()) {
            this.N = false;
            if (this.x == null) {
                this.x = new AlphaAnimation(0.0f, 0.95f);
                this.x.setDuration(300L);
                this.x.setFillAfter(true);
            }
            this.v.startAnimation(this.x);
            this.w.setVisibility(0);
            if (this.y == null) {
                this.y = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                this.y.setDuration(200L);
                this.y.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.42
                    public static ChangeQuickRedirect a;

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        Object[] objArr2 = {animation};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22362682322036cf993d741811a009ca", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22362682322036cf993d741811a009ca");
                        } else {
                            g.this.L.setVisibility(0);
                        }
                    }
                });
            }
            this.w.startAnimation(this.y);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a360e1c72b65a84b05ecd92af8bad60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a360e1c72b65a84b05ecd92af8bad60");
            return;
        }
        super.bE_();
        if (Q().equals(d.b)) {
            if (this.u != null) {
                this.u.a();
            }
            if (this.C != null) {
                this.C.b();
            }
            if (this.s != null) {
                this.s.a();
            }
        }
    }

    private boolean a(JSONArray jSONArray) {
        JSONObject jSONObject;
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ab6fb79dc85807f906b185f615bad71", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ab6fb79dc85807f906b185f615bad71")).booleanValue();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if ((jSONArray.get(i) instanceof JSONObject) && (jSONObject = (JSONObject) jSONArray.get(i)) != null && jSONObject.optInt("product_type") == 32) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f341e27f99d0cf7bc368aca6ebe290b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f341e27f99d0cf7bc368aca6ebe290b7");
        }
        switch (i) {
            case 0:
                return m().getString(R.string.wm_order_confirm_still_order);
            case 1:
                return m().getString(R.string.wm_order_confirm_go_to_map);
            case 2:
                return m().getString(R.string.wm_order_confirm_look_around);
            default:
                return null;
        }
    }

    DialogInterface.OnClickListener c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "921934c3e91aba6b5fcdaad354bf055e", RobustBitConfig.DEFAULT_VALUE)) {
            return (DialogInterface.OnClickListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "921934c3e91aba6b5fcdaad354bf055e");
        }
        switch (i) {
            case 0:
                return new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.47
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0271624168543d0d5dafb2e72ef45fa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0271624168543d0d5dafb2e72ef45fa");
                            return;
                        }
                        ((com.sankuai.waimai.bussiness.order.confirm.a) g.this.F()).aa.a();
                        g.this.O = false;
                        g.this.P();
                    }
                };
            case 1:
                return new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.48
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fe9dbfd9a303a001ffde0a4d2899d07", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fe9dbfd9a303a001ffde0a4d2899d07");
                        } else {
                            g.A(g.this);
                        }
                    }
                };
            case 2:
                return new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.49
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f1c1a5ae58854f859b6267d9a7a0fbf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f1c1a5ae58854f859b6267d9a7a0fbf");
                        } else {
                            g.B(g.this);
                        }
                    }
                };
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb63e4d2a29e0d2aa89baf513924cda1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb63e4d2a29e0d2aa89baf513924cda1");
        } else {
            d.b(true, false, "check_shipping_area", Integer.valueOf(this.O ? 1 : 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9840028ff7562babd548c56e043124", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9840028ff7562babd548c56e043124")).booleanValue();
        }
        if (m() instanceof OrderConfirmActivity) {
            return ((OrderConfirmActivity) m()).b();
        }
        return false;
    }

    private String Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d820ccc3de70909a9316f64a8eafe15", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d820ccc3de70909a9316f64a8eafe15");
        }
        if (m() instanceof BaseActivity) {
            return ((BaseActivity) m()).w();
        }
        return getClass().getSimpleName() + System.currentTimeMillis();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b extends com.meituan.android.cube.pga.viewmodel.a {
        public b() {
        }
    }
}
