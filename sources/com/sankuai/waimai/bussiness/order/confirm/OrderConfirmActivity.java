package com.sankuai.waimai.bussiness.order.confirm;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.dianping.titans.utils.StorageUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.common.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import com.sankuai.waimai.business.order.api.confirm.block.a;
import com.sankuai.waimai.business.order.api.submit.model.CollectOrder;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.business.order.submit.model.AdditionalBargain;
import com.sankuai.waimai.business.order.submit.model.ExpectedArrivalInfoInput;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.base.pay.OrderPayResultManager;
import com.sankuai.waimai.bussiness.order.base.pay.d;
import com.sankuai.waimai.bussiness.order.base.pay.payment.PaymentManager;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity;
import com.sankuai.waimai.bussiness.order.confirm.helper.e;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.helper.g;
import com.sankuai.waimai.bussiness.order.confirm.model.AddressBackInfo;
import com.sankuai.waimai.bussiness.order.confirm.model.PhoneInfo;
import com.sankuai.waimai.bussiness.order.confirm.model.PreviewSubmitModel;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.m;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.bussiness.order.confirm.request.update.a;
import com.sankuai.waimai.bussiness.order.confirm.submit.c;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.LocationResultCode;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.cube.BasePGAActivity;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.core.multiperson.MultiPersonCart;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.utils.k;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderConfirmActivity extends BasePGAActivity implements FFPTags, d, com.sankuai.waimai.foundation.core.service.user.b {
    public static ChangeQuickRedirect a = null;
    private static final String o = "OrderConfirmActivity";
    private e D;
    private int E;
    private int F;
    @NonNull
    private final f G;
    private final com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e H;
    private com.sankuai.waimai.foundation.core.service.screenshot.observer.a I;
    private boolean J;
    private boolean K;
    private boolean L;
    private MultiPersonCart M;
    private String N;
    private String O;
    private String P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private com.sankuai.waimai.platform.domain.core.response.a U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private double Z;
    private double aa;
    private long ab;
    private String ac;
    private List<OrderedFood> ad;
    private List<WmOrderedFood> ae;
    private Typeface af;
    private boolean ag;
    private OrderResponse ah;
    private final Handler ai;
    private boolean aj;
    private String ak;
    private boolean al;
    private boolean am;
    private List<Map<String, Object>> an;
    private a.b ao;
    private com.sankuai.waimai.bussiness.order.confirm.submit.b ap;
    private final View.OnClickListener aq;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    @NonNull
    public final com.sankuai.waimai.bussiness.order.confirm.a g;
    protected RecyclerView h;
    protected View i;
    protected View j;
    public long k;
    public String l;
    private String p;
    private String q;
    private String r;
    private String s;
    private boolean t;
    @NonNull
    private final Map<String, Object> u;
    @NonNull
    private final Map<String, Object> v;

    public OrderConfirmActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6718886fc1fbd5ea188ce20aef2c7d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6718886fc1fbd5ea188ce20aef2c7d7");
            return;
        }
        this.t = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.u = new HashMap();
        this.v = new HashMap();
        this.G = new f() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void b(int i) {
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final long aH_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d1811d9ce932b7c1f68dba6b1b6611d", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d1811d9ce932b7c1f68dba6b1b6611d")).longValue() : OrderConfirmActivity.this.k;
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final String aI_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbfa98a90b753af69784e92e161c298c", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbfa98a90b753af69784e92e161c298c");
                }
                if (aa.a(OrderConfirmActivity.this.l)) {
                    OrderConfirmActivity.this.l = com.sankuai.waimai.platform.domain.core.poi.b.a(OrderConfirmActivity.this.k);
                }
                return OrderConfirmActivity.this.l;
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final boolean aJ_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e701b84c926f032cafde76cee93a53b8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e701b84c926f032cafde76cee93a53b8")).booleanValue() : OrderConfirmActivity.this.L;
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final int aK_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "650ce98b7dce4780b4ec81ad4c5c259b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "650ce98b7dce4780b4ec81ad4c5c259b")).intValue();
                }
                if (OrderConfirmActivity.this.M == null || OrderConfirmActivity.this.M.getShoppingCart() == null || OrderConfirmActivity.this.M.getShoppingCart().getShoppingItems() == null) {
                    return 1;
                }
                return OrderConfirmActivity.this.M.getShoppingCart().getShoppingItems().size();
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void a(Map<String, Object> map) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64acab3768e61d0e1948b8b2d89684ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64acab3768e61d0e1948b8b2d89684ff");
                } else {
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.putAll(map);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64f334f637d80186ab9a78c6f34507b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64f334f637d80186ab9a78c6f34507b2");
                } else if (5 == i) {
                    OrderConfirmActivity.this.a(OrderConfirmActivity.this.g.bn.a().b, OrderConfirmActivity.this.g.aL_(), true, false);
                } else {
                    OrderConfirmActivity.this.a(i);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void b(Map<String, Object> map) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83aba27ad1cbb92287584a08a9426695", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83aba27ad1cbb92287584a08a9426695");
                } else {
                    OrderConfirmActivity.this.a(map, OrderConfirmActivity.this.g.aL_(), true, false);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void a(int i, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a8c074e9c7a9f43ae05dff79ab74a91", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a8c074e9c7a9f43ae05dff79ab74a91");
                    return;
                }
                OrderConfirmActivity orderConfirmActivity = OrderConfirmActivity.this;
                Object[] objArr3 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = OrderConfirmActivity.a;
                if (PatchProxy.isSupport(objArr3, orderConfirmActivity, changeQuickRedirect3, false, "02e257d6c6fe41518ccd33f042d38065", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, orderConfirmActivity, changeQuickRedirect3, false, "02e257d6c6fe41518ccd33f042d38065");
                } else if (i == -1) {
                    orderConfirmActivity.a(true, false);
                } else {
                    orderConfirmActivity.a(i, z);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void a(int i, ArrayList<AdditionalBargain.AdditionalBargainDetail> arrayList) {
                Object[] objArr2 = {Integer.valueOf(i), arrayList};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e6d0549e4c911a0e43435a397ef0cf0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e6d0549e4c911a0e43435a397ef0cf0");
                } else {
                    a(i);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final int aL_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "351fe4ff49ebee2f2a2a2efd47a74091", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "351fe4ff49ebee2f2a2a2efd47a74091")).intValue() : OrderConfirmActivity.this.g.w.a().c();
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final boolean aM_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f9c1adab07297a325efc4b2b147845f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f9c1adab07297a325efc4b2b147845f")).booleanValue() : OrderConfirmActivity.this.ag;
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final Typeface aN_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d8bebb2894895a480b22b2e7e714f85", RobustBitConfig.DEFAULT_VALUE) ? (Typeface) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d8bebb2894895a480b22b2e7e714f85") : OrderConfirmActivity.this.af;
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final boolean aO_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a356e130d653922b890d6a50f183152", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a356e130d653922b890d6a50f183152")).booleanValue() : !OrderConfirmActivity.this.D.a(OrderConfirmActivity.this.k);
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void a(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc18e9267ad872d766704a86846ab388", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc18e9267ad872d766704a86846ab388");
                    return;
                }
                View view2 = (View) view.getParent();
                if (view2 == null) {
                    return;
                }
                while (!view2.equals(OrderConfirmActivity.this.h)) {
                    view2.getTop();
                    view2 = (View) view2.getParent();
                }
                view.getTop();
                OrderConfirmActivity.this.g.aQ.a().c();
            }
        };
        this.g = new com.sankuai.waimai.bussiness.order.confirm.a(this, this.G);
        this.H = new com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.12
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e
            public final void a(long j, String str, List<OrderedFood> list) {
                Object[] objArr2 = {new Long(j), str, list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ab503e685b38fe4821ca4e5eb12e796", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ab503e685b38fe4821ca4e5eb12e796");
                } else if (com.sankuai.waimai.foundation.utils.d.a(list)) {
                } else {
                    OrderConfirmActivity.this.ab = j;
                    OrderConfirmActivity.this.ac = str;
                    OrderConfirmActivity.this.ad = list;
                    OrderConfirmActivity.this.ae = com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.a(list);
                    OrderConfirmActivity.this.a(3);
                    OrderConfirmActivity.this.Y = true;
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6162cb4daf29cb4a13008ec9df763da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6162cb4daf29cb4a13008ec9df763da");
                } else {
                    OrderConfirmActivity.this.v();
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50674c8d80816c715c0646e23c377e1e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50674c8d80816c715c0646e23c377e1e");
                } else {
                    OrderConfirmActivity.this.u();
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae317d61a140f0592af0ef8454181134", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae317d61a140f0592af0ef8454181134");
                } else {
                    OrderConfirmActivity.this.v();
                }
            }
        };
        this.I = new com.sankuai.waimai.foundation.core.service.screenshot.observer.b() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.19
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.screenshot.observer.b, com.sankuai.waimai.foundation.core.service.screenshot.observer.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "736981ab8d9b3097c0c7d22288509f4e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "736981ab8d9b3097c0c7d22288509f4e");
                } else if (TextUtils.equals(str, OrderConfirmActivity.class.getName())) {
                    JudasManualManager.a("b_fq46u68k").a("c_ykhs39e").a("poi_id", i.a(OrderConfirmActivity.this.k, OrderConfirmActivity.this.l)).a(OrderConfirmActivity.this).a();
                }
            }
        };
        this.J = false;
        this.L = false;
        this.Q = false;
        this.R = false;
        this.T = false;
        this.U = new com.sankuai.waimai.platform.domain.core.response.a();
        this.Y = false;
        this.l = "";
        this.ai = new Handler();
        this.aj = false;
        this.al = false;
        this.am = false;
        this.an = new ArrayList();
        this.ao = new a.b() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.23
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.b
            public final void a(boolean z) {
                Object[] objArr2 = {(byte) 0};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ea1a37644a4d1a1a5cf3f2fc74c161f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ea1a37644a4d1a1a5cf3f2fc74c161f");
                } else {
                    OrderConfirmActivity.this.R = false;
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e70973238b2de4fde5b7c95cba0f0f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e70973238b2de4fde5b7c95cba0f0f3");
                } else {
                    OrderConfirmActivity.this.q();
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
                if (r2.size() > 0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
                if (r2.size() > 0) goto L22;
             */
            @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(@org.jetbrains.annotations.NotNull com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse r13) {
                /*
                    Method dump skipped, instructions count: 248
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.AnonymousClass23.a(com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse):void");
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.b
            public final void b(boolean z) {
                Object[] objArr2 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b45b74c7d9f7c584b23ba519293ede1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b45b74c7d9f7c584b23ba519293ede1");
                } else {
                    OrderConfirmActivity.this.S = true;
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.b
            public final void a(OrderResponse orderResponse, double d) {
                Object[] objArr2 = {orderResponse, Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91f2a7e3ab852262600cf948a802ce0e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91f2a7e3ab852262600cf948a802ce0e");
                    return;
                }
                String string = OrderConfirmActivity.this.getString(R.string.wm_order_base_order_not_reach_min_price_1, new Object[]{h.a(d)});
                OrderConfirmActivity orderConfirmActivity = OrderConfirmActivity.this;
                Activity bB_ = OrderConfirmActivity.this.bB_();
                if (!TextUtils.isEmpty(orderResponse.f)) {
                    string = orderResponse.f;
                }
                OrderConfirmActivity.a(orderConfirmActivity, bB_, string);
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.b
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29b5959ae7d7e4f713cbb58218aa2bd8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29b5959ae7d7e4f713cbb58218aa2bd8");
                    return;
                }
                OrderConfirmActivity.this.g.aB.a((com.meituan.android.cube.pga.common.b<Void>) null);
                OrderConfirmActivity.this.a(2);
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.b
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d89012ac5b30df74733615af0407808", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d89012ac5b30df74733615af0407808");
                } else {
                    OrderConfirmActivity.this.g.bo.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(i));
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.b
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de286929866900e5485d57f26b89eaae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de286929866900e5485d57f26b89eaae");
                    return;
                }
                if (OrderConfirmActivity.this.Y) {
                    if (OrderConfirmActivity.this.ah != null) {
                        Object obj = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("food_list");
                        OrderConfirmActivity.this.ae = com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.a(obj != null ? (List) obj : new ArrayList());
                        OrderConfirmActivity.this.ab = -1L;
                        OrderConfirmActivity.this.ac = "";
                        OrderConfirmActivity.this.ad = null;
                    }
                    OrderConfirmActivity.this.Y = false;
                }
                OrderConfirmActivity.this.g.bc.a((com.meituan.android.cube.pga.common.b<Void>) null);
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b();
                OrderConfirmActivity.this.g.ba.a();
                OrderConfirmActivity.this.g.bm.a();
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.b
            public final void b(@NonNull OrderResponse orderResponse) {
                Object[] objArr2 = {orderResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9549ed5509a16f53461834bee3faf197", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9549ed5509a16f53461834bee3faf197");
                } else if (orderResponse.a()) {
                    OrderConfirmActivity.q(OrderConfirmActivity.this);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.b
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b2df12a4286a100852db76deefe4baa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b2df12a4286a100852db76deefe4baa");
                    return;
                }
                HashMap hashMap = new HashMap();
                int aL_ = OrderConfirmActivity.this.g.aL_();
                hashMap.put("toast", OrderConfirmActivity.this.getString(R.string.wm_order_confirm_switched_original_business));
                hashMap.put("wm_poi_id", Long.valueOf(OrderConfirmActivity.this.D.b));
                OrderConfirmActivity.this.a((Map<String, Object>) hashMap, aL_, true, true);
            }
        };
        this.ap = new com.sankuai.waimai.bussiness.order.confirm.submit.b() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final String j() {
                return "c_ykhs39e";
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void a(boolean z) {
                Object[] objArr2 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4bc094eb8493ead91d2abc2cb12f119", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4bc094eb8493ead91d2abc2cb12f119");
                } else {
                    OrderConfirmActivity.this.S = true;
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9dde4c8f5191e3da12e5397225b5c72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9dde4c8f5191e3da12e5397225b5c72");
                } else {
                    OrderConfirmActivity.this.q();
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void a(JSONObject jSONObject) {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f361c8939f995b15ac611ff096b3f7d7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f361c8939f995b15ac611ff096b3f7d7");
                } else {
                    OrderConfirmActivity.a(OrderConfirmActivity.this, jSONObject);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void a(int i, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f89fec4b45d388e3463a877d24e2a321", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f89fec4b45d388e3463a877d24e2a321");
                    return;
                }
                if (i == 1) {
                    OrderConfirmActivity.this.g.aU.a((com.meituan.android.cube.pga.common.b<String>) "0");
                }
                if (z) {
                    OrderConfirmActivity.this.a(2);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void a(BaseResponse baseResponse) {
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4709d56b5d9b9bcac165d1a133e4a8f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4709d56b5d9b9bcac165d1a133e4a8f");
                    return;
                }
                JSONObject jSONObject = (JSONObject) baseResponse.data;
                OrderConfirmActivity.this.g.Z.a((com.meituan.android.cube.pga.common.b<i.c<Integer, Integer>>) com.meituan.android.cube.pga.common.i.a(Integer.valueOf(jSONObject.optInt("left_btn", 0)), Integer.valueOf(jSONObject.optInt("right_btn", 1))));
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void a(BaseResponse baseResponse, DialogInterface dialogInterface) {
                Object[] objArr2 = {baseResponse, dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae7572ff82e7160d3a2bc303feee2c10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae7572ff82e7160d3a2bc303feee2c10");
                    return;
                }
                JSONObject jSONObject = (JSONObject) baseResponse.data;
                if (jSONObject != null) {
                    if (jSONObject.optInt("refresh") == 1) {
                        OrderConfirmActivity.this.a(2);
                        com.sankuai.waimai.platform.domain.manager.poi.a.a().a(OrderConfirmActivity.this.l);
                    }
                    dialogInterface.dismiss();
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void b(BaseResponse baseResponse) {
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "021f61ad2d5572ae2d015e82df190c18", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "021f61ad2d5572ae2d015e82df190c18");
                    return;
                }
                JSONObject jSONObject = (JSONObject) baseResponse.data;
                OrderConfirmActivity.a(OrderConfirmActivity.this, jSONObject != null ? jSONObject.optJSONArray("missingfoods") : null, baseResponse.msg, OrderConfirmActivity.this.getString(R.string.wm_order_confirm_activity_good_out_of_stock));
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4d4a83e347ce4f5549bb17ee86ef0e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4d4a83e347ce4f5549bb17ee86ef0e8");
                    return;
                }
                OrderConfirmActivity.e(OrderConfirmActivity.this, true);
                OrderConfirmActivity.this.l();
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void a(BaseResponse baseResponse, double d) {
                Object[] objArr2 = {baseResponse, Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "216d2f4730cc6222826a5196d85e5eb1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "216d2f4730cc6222826a5196d85e5eb1");
                    return;
                }
                String string = OrderConfirmActivity.this.getString(R.string.wm_order_base_order_not_reach_min_price_1, new Object[]{h.a(d)});
                OrderConfirmActivity orderConfirmActivity = OrderConfirmActivity.this;
                Activity bB_ = OrderConfirmActivity.this.bB_();
                if (!TextUtils.isEmpty(baseResponse.msg)) {
                    string = baseResponse.msg;
                }
                OrderConfirmActivity.a(orderConfirmActivity, bB_, string);
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa8738e1a3915e8281b44970727c7dee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa8738e1a3915e8281b44970727c7dee");
                    return;
                }
                OrderConfirmActivity.this.g.aB.a((com.meituan.android.cube.pga.common.b<Void>) null);
                OrderConfirmActivity.this.a(2);
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14a17e4e09f0fabd980ca01d0faa49e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14a17e4e09f0fabd980ca01d0faa49e1");
                    return;
                }
                OrderConfirmActivity.f(OrderConfirmActivity.this, true);
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("user_drop_activity", Boolean.TRUE);
                OrderConfirmActivity.this.g.bb.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
                OrderConfirmActivity.this.l();
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a2e9ef079fba3168b70e895257798fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a2e9ef079fba3168b70e895257798fb");
                } else {
                    OrderConfirmActivity.this.g.b(0);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void c(BaseResponse baseResponse) {
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "638d4c1a4a519a92c2f687f2632f2e44", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "638d4c1a4a519a92c2f687f2632f2e44");
                    return;
                }
                JSONObject jSONObject = (JSONObject) baseResponse.data;
                OrderConfirmActivity.this.g.az.a((com.meituan.android.cube.pga.common.b<i.c<String, String>>) com.meituan.android.cube.pga.common.i.a(jSONObject.optString("title"), jSONObject.optString("description")));
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8945af5492c3e3fab8994a80f3febda4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8945af5492c3e3fab8994a80f3febda4");
                } else {
                    OrderConfirmActivity.this.a(2);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void c(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3761c9e921e4120e23f25af24e6e36ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3761c9e921e4120e23f25af24e6e36ba");
                } else {
                    OrderConfirmActivity.this.g.bo.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(i));
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void h() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2fd4797ee0759a7b85c33f37b68f82f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2fd4797ee0759a7b85c33f37b68f82f");
                    return;
                }
                OrderConfirmActivity.g(OrderConfirmActivity.this, true);
                OrderConfirmActivity.this.l();
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void i() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7824af1378f0e461ffee4b5b3ba0bf3c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7824af1378f0e461ffee4b5b3ba0bf3c");
                } else {
                    OrderConfirmActivity.this.g.ao.a();
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void a(PreviewSubmitModel.ExtraParam extraParam) {
                Object[] objArr2 = {extraParam};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e76b3afa9ee0180351c8b8409159ccd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e76b3afa9ee0180351c8b8409159ccd");
                } else if (extraParam == null) {
                } else {
                    PaymentManager.cancelCurrentOrder(extraParam.orderId, OrderConfirmActivity.this, OrderConfirmActivity.this.w(), new a());
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void b(PreviewSubmitModel.ExtraParam extraParam) {
                Object[] objArr2 = {extraParam};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca00161cbaf7592c22871969d895b1cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca00161cbaf7592c22871969d895b1cc");
                } else if (extraParam == null) {
                } else {
                    OrderConfirmActivity.this.p = extraParam.orderId;
                    OrderConfirmActivity.this.u();
                    PaymentManager.continuePay(OrderConfirmActivity.this, extraParam.orderId, "1", OrderConfirmActivity.this.w(), null, new b(extraParam.orderId), new a());
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void a(int i) {
                Map<String, Object> hashMap;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a2dca1abddff0618e965fdb696e973f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a2dca1abddff0618e965fdb696e973f");
                    return;
                }
                Object obj = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("drug_order_confirm_prescription_inquiry_template_style_1_error_dialog_param");
                if (obj instanceof Map) {
                    hashMap = (Map) obj;
                } else {
                    hashMap = new HashMap<>();
                }
                if (i == 1) {
                    JudasManualManager.a a2 = JudasManualManager.a("b_waimai_oj4kx5zw_mc");
                    a2.a("button_code", "0");
                    a2.a("template_type", 1);
                    a2.b(hashMap);
                    a2.a("c_ykhs39e");
                    a2.a(OrderConfirmActivity.this).a();
                } else if (i != 2) {
                    if (i == 3) {
                        JudasManualManager.a a3 = JudasManualManager.a("b_waimai_31s9vaa9_mv");
                        a3.a("template_type", 1);
                        a3.b(hashMap);
                        a3.a("c_ykhs39e");
                        a3.a(OrderConfirmActivity.this).a();
                    }
                } else {
                    JudasManualManager.a a4 = JudasManualManager.a("b_waimai_oj4kx5zw_mc");
                    a4.a("button_code", "1");
                    a4.a("template_type", 1);
                    a4.b(hashMap);
                    a4.a("c_ykhs39e");
                    a4.a(OrderConfirmActivity.this).a();
                    Object obj2 = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("drug_order_confirm_prescription_inquiry_template_style_1_scheme");
                    com.sankuai.waimai.foundation.router.a.a(OrderConfirmActivity.this.bB_(), obj2 instanceof String ? (String) obj2 : "", new Bundle(), 1002);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void b(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7764b347cf1d31233d7f705841b0f41", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7764b347cf1d31233d7f705841b0f41");
                } else {
                    OrderConfirmActivity.this.g.U.b(Integer.valueOf(i));
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
            public final void g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad5ce1f4f75092cf67c01c068f91142a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad5ce1f4f75092cf67c01c068f91142a");
                    return;
                }
                OrderConfirmActivity.h(OrderConfirmActivity.this, true);
                OrderConfirmActivity.this.an = g.a().b();
                g.a().c();
                OrderConfirmActivity.this.a(2);
            }
        };
        this.aq = new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.10
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final Dialog dialog;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f94927a4fad0113dc656505fd4e0b6d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f94927a4fad0113dc656505fd4e0b6d");
                } else if (view != OrderConfirmActivity.this.j) {
                    OrderConfirmActivity.this.J = false;
                    OrderConfirmActivity.this.h();
                } else {
                    JudasManualManager.a("b_waimai_waa0f92i_mc").a("c_ykhs39e").a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(OrderConfirmActivity.this.k, OrderConfirmActivity.this.l)).a(OrderConfirmActivity.this).a();
                    OrderConfirmActivity.this.J = true;
                    String a2 = OrderConfirmActivity.this.g.bi.a().a();
                    if (OrderConfirmActivity.this.g.bh.a().c() == 1 && !TextUtils.isEmpty(a2)) {
                        final OrderConfirmActivity orderConfirmActivity = OrderConfirmActivity.this;
                        Object[] objArr3 = {a2};
                        ChangeQuickRedirect changeQuickRedirect3 = OrderConfirmActivity.a;
                        if (PatchProxy.isSupport(objArr3, orderConfirmActivity, changeQuickRedirect3, false, "7f469aa3613b09415ec6c2917caed631", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, orderConfirmActivity, changeQuickRedirect3, false, "7f469aa3613b09415ec6c2917caed631");
                            return;
                        }
                        View inflate = LayoutInflater.from(orderConfirmActivity).inflate(R.layout.wm_order_submit_pay_by_others_dialog, (ViewGroup) null);
                        ((TextView) inflate.findViewById(R.id.txt_confirm_save_money)).setText(a2);
                        Object[] objArr4 = {inflate};
                        ChangeQuickRedirect changeQuickRedirect4 = OrderConfirmActivity.a;
                        if (PatchProxy.isSupport(objArr4, orderConfirmActivity, changeQuickRedirect4, false, "a3fa683738e072d3aec01111d1186752", RobustBitConfig.DEFAULT_VALUE)) {
                            dialog = (Dialog) PatchProxy.accessDispatch(objArr4, orderConfirmActivity, changeQuickRedirect4, false, "a3fa683738e072d3aec01111d1186752");
                        } else {
                            dialog = new Dialog(orderConfirmActivity, 16973833);
                            dialog.requestWindowFeature(1);
                            dialog.getWindow().setLayout(-1, -1);
                            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(-1728053248));
                            dialog.setContentView(inflate);
                            dialog.setCancelable(false);
                            dialog.setCanceledOnTouchOutside(false);
                        }
                        if (dialog != null) {
                            dialog.findViewById(R.id.btn_confirm_pay_by_myself).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.7
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    Object[] objArr5 = {view2};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2a6cc47a0f6bb3c1974d8824a0eafb6c", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2a6cc47a0f6bb3c1974d8824a0eafb6c");
                                        return;
                                    }
                                    OrderConfirmActivity.a(OrderConfirmActivity.this, "b_pay_y6rytkoh_mc", "本人付款");
                                    OrderConfirmActivity.this.J = false;
                                    OrderConfirmActivity.this.h();
                                    dialog.dismiss();
                                }
                            });
                            dialog.findViewById(R.id.btn_confirm_pay_by_others).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.8
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    Object[] objArr5 = {view2};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fccb80b002b1fd54c9870e3451dfda1f", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fccb80b002b1fd54c9870e3451dfda1f");
                                        return;
                                    }
                                    OrderConfirmActivity.a(OrderConfirmActivity.this, "b_pay_y6rytkoh_mc", "继续找人付");
                                    OrderConfirmActivity.this.h();
                                    dialog.dismiss();
                                }
                            });
                            dialog.findViewById(R.id.cancel_order_close).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.9
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    Object[] objArr5 = {view2};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0253d155ccb74ef92ce4164c7213b423", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0253d155ccb74ef92ce4164c7213b423");
                                        return;
                                    }
                                    OrderConfirmActivity.a(OrderConfirmActivity.this, "b_pay_yymtm0h0_mc", "");
                                    dialog.dismiss();
                                }
                            });
                        }
                        if (dialog.isShowing()) {
                            return;
                        }
                        JudasManualManager.b("b_pay_y6rytkoh_mv").a("c_pay_nq6zmps5").a(orderConfirmActivity).b(Constants.EventType.PAY);
                        dialog.show();
                        return;
                    }
                    OrderConfirmActivity.this.h();
                }
            }
        };
    }

    public static /* synthetic */ void a(OrderConfirmActivity orderConfirmActivity, final Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderConfirmActivity, changeQuickRedirect, false, "e339e16faa4999e7616c3b35d306b5ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderConfirmActivity, changeQuickRedirect, false, "e339e16faa4999e7616c3b35d306b5ad");
        } else {
            new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558627)).b(str).a(R.string.wm_order_confirm_change_another_address, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.25
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6302ebe90b4bfe682c6f9ed2837101fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6302ebe90b4bfe682c6f9ed2837101fe");
                        return;
                    }
                    dialogInterface.dismiss();
                    OrderConfirmActivity.this.g.aN.a((com.meituan.android.cube.pga.common.b<i.c<Long, Integer>>) com.meituan.android.cube.pga.common.i.a(-1L, 2));
                }
            }).b(R.string.wm_order_confirm_continue_adding, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.24
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc800e32857177ea85c2640cf48ef193", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc800e32857177ea85c2640cf48ef193");
                        return;
                    }
                    dialogInterface.dismiss();
                    activity.finish();
                }
            }).b();
        }
    }

    public static /* synthetic */ void a(OrderConfirmActivity orderConfirmActivity, AddressBean addressBean) {
        Object[] objArr = {addressBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderConfirmActivity, changeQuickRedirect, false, "09d74e331e4a3d4fb9c2956079d96801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderConfirmActivity, changeQuickRedirect, false, "09d74e331e4a3d4fb9c2956079d96801");
        } else if (addressBean != null) {
            com.sankuai.waimai.foundation.location.g.a(com.sankuai.waimai.addrsdk.utils.e.a(addressBean.getLatitude() / 1000000.0d, 6), com.sankuai.waimai.addrsdk.utils.e.a(addressBean.getLongitude() / 1000000.0d, 6), addressBean.getAddressName());
            com.sankuai.waimai.foundation.location.g.b(null);
            String a2 = com.sankuai.waimai.platform.domain.manager.location.g.a(com.sankuai.waimai.platform.domain.manager.location.a.a(addressBean.getProvince(), addressBean.getCityName()), orderConfirmActivity.getString(R.string.wm_address_city));
            if (!TextUtils.isEmpty(a2)) {
                com.sankuai.waimai.foundation.location.g.c(a2);
            }
            com.sankuai.waimai.platform.domain.manager.location.a.b(com.sankuai.waimai.platform.domain.manager.location.a.a(addressBean));
            WmAddress wmAddress = new WmAddress();
            WMLocation wMLocation = new WMLocation(WMLocation.WM_LOCATION_ADD_ADDRSS);
            wMLocation.setLongitude(com.sankuai.waimai.addrsdk.utils.e.a(addressBean.getLongitude() / 1000000.0d, 6));
            wMLocation.setLatitude(com.sankuai.waimai.addrsdk.utils.e.a(addressBean.getLatitude() / 1000000.0d, 6));
            LocationResultCode locationResultCode = new LocationResultCode();
            locationResultCode.a = 1200;
            locationResultCode.b = "";
            wMLocation.setLocationResultCode(locationResultCode);
            wmAddress.setWMLocation(wMLocation);
            wmAddress.setCreateTime(System.currentTimeMillis());
            wmAddress.setAddress(addressBean.getAddressName());
            City city = new City();
            city.setCityName(a2);
            city.setCityCode(addressBean.getCityCode());
            wmAddress.setMafCity(city);
            com.sankuai.waimai.foundation.location.v2.g.a().a(wmAddress, com.sankuai.waimai.platform.domain.manager.location.v2.b.ORDER_CONFIRM.toString(), false);
            com.sankuai.waimai.platform.domain.manager.location.a.a(wmAddress);
            com.sankuai.waimai.bussiness.order.base.a.a(orderConfirmActivity, orderConfirmActivity.k, orderConfirmActivity.l);
        }
    }

    public static /* synthetic */ void a(OrderConfirmActivity orderConfirmActivity, String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderConfirmActivity, changeQuickRedirect, false, "9de579a3d2e5bae19a50a0e577d47f89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderConfirmActivity, changeQuickRedirect, false, "9de579a3d2e5bae19a50a0e577d47f89");
            return;
        }
        JudasManualManager.a a2 = JudasManualManager.a(str).a("c_pay_nq6zmps5").a(orderConfirmActivity);
        if (!TextUtils.isEmpty(str2)) {
            a2.a("button_name", str2);
        }
        a2.b(Constants.EventType.PAY);
    }

    public static /* synthetic */ void a(OrderConfirmActivity orderConfirmActivity, JSONArray jSONArray, String str, String str2) {
        Object[] objArr = {jSONArray, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderConfirmActivity, changeQuickRedirect, false, "0cc2b30760a1cd6fa8c61dd370345457", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderConfirmActivity, changeQuickRedirect, false, "0cc2b30760a1cd6fa8c61dd370345457");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        final List<com.sankuai.waimai.platform.domain.core.order.a> a2 = com.sankuai.waimai.platform.domain.core.order.a.a(jSONArray);
        if (a2 == null || a2.isEmpty()) {
            ae.a(orderConfirmActivity.bB_(), str);
        } else {
            new RooAlertDialog.a(new ContextThemeWrapper(orderConfirmActivity, 2131558627)).b(str).a(R.string.wm_order_confirm_select_again, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.6
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b567045b45382f247f58cefd6f42ea10", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b567045b45382f247f58cefd6f42ea10");
                        return;
                    }
                    GlobalCartManager.getInstance().setActivityErrorFood(SubmitOrderManager.getInstance().getSourceType(), OrderConfirmActivity.this.l, a2);
                    OrderConfirmActivity.this.finish();
                    OrderConfirmActivity.b(OrderConfirmActivity.this, OrderConfirmActivity.this.k);
                }
            }).b(R.string.wm_order_confirm_continue_order, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "215b9ab3046410cf259c0e24b74f9f4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "215b9ab3046410cf259c0e24b74f9f4b");
                        return;
                    }
                    OrderConfirmActivity.e(OrderConfirmActivity.this, true);
                    OrderConfirmActivity.this.l();
                }
            }).b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0482  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity r25, org.json.JSONObject r26) {
        /*
            Method dump skipped, instructions count: 1473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.a(com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity, org.json.JSONObject):void");
    }

    public static /* synthetic */ void b(OrderConfirmActivity orderConfirmActivity, long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderConfirmActivity, changeQuickRedirect, false, "06d3e31acd63a32e9fd551ddc8c06554", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderConfirmActivity, changeQuickRedirect, false, "06d3e31acd63a32e9fd551ddc8c06554");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("poiId", j);
        intent.putExtra("isopenshopcart", true);
        intent.putExtra("extra_is_self_delivery", com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) orderConfirmActivity, "is_self_delivery", 0) == 1);
        if (orderConfirmActivity.X) {
            if (orderConfirmActivity.p()) {
                orderConfirmActivity.setResult(-1, intent);
                orderConfirmActivity.finish();
                return;
            }
            com.sankuai.waimai.foundation.router.a.a(orderConfirmActivity, com.sankuai.waimai.business.order.api.store.f.a(orderConfirmActivity.ak), intent.getExtras());
        } else if (orderConfirmActivity.V) {
            boolean z = orderConfirmActivity.g.aL_() == 2;
            if (orderConfirmActivity.p()) {
                orderConfirmActivity.setResult(-1, intent);
                orderConfirmActivity.finish();
            } else if (z) {
                com.sankuai.waimai.foundation.router.a.a(orderConfirmActivity, com.sankuai.waimai.foundation.router.interfaces.c.e, intent.getExtras());
            } else {
                com.sankuai.waimai.foundation.router.a.a(orderConfirmActivity, com.sankuai.waimai.foundation.router.interfaces.c.b, intent.getExtras());
            }
        }
    }

    public static /* synthetic */ boolean e(OrderConfirmActivity orderConfirmActivity, boolean z) {
        orderConfirmActivity.Q = true;
        return true;
    }

    public static /* synthetic */ boolean f(OrderConfirmActivity orderConfirmActivity, boolean z) {
        orderConfirmActivity.al = true;
        return true;
    }

    public static /* synthetic */ boolean g(OrderConfirmActivity orderConfirmActivity, boolean z) {
        orderConfirmActivity.T = true;
        return true;
    }

    public static /* synthetic */ boolean h(OrderConfirmActivity orderConfirmActivity, boolean z) {
        orderConfirmActivity.am = true;
        return true;
    }

    public static /* synthetic */ void m(OrderConfirmActivity orderConfirmActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderConfirmActivity, changeQuickRedirect, false, "5f56e651a5bc1b51413428679c02a307", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderConfirmActivity, changeQuickRedirect, false, "5f56e651a5bc1b51413428679c02a307");
            return;
        }
        orderConfirmActivity.J = false;
        orderConfirmActivity.Q = false;
        orderConfirmActivity.T = false;
        orderConfirmActivity.D.b();
        if (orderConfirmActivity.D.a(orderConfirmActivity.k)) {
            return;
        }
        Object obj = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("food_list");
        orderConfirmActivity.ae = com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.a(obj != null ? (List) obj : new ArrayList());
    }

    public static /* synthetic */ void q(OrderConfirmActivity orderConfirmActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderConfirmActivity, changeQuickRedirect, false, "03f4c1303b419d0d598dbe52aeb37b85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderConfirmActivity, changeQuickRedirect, false, "03f4c1303b419d0d598dbe52aeb37b85");
            return;
        }
        orderConfirmActivity.b(orderConfirmActivity.D.d);
        orderConfirmActivity.D.b();
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d905769f5a23393168822b31c5ad2c80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d905769f5a23393168822b31c5ad2c80");
            return;
        }
        if (this.ah == null) {
            this.ah = (OrderResponse) c.a().a(OrderResponse.class);
        }
        if (this.ah != null) {
            this.F = this.ah.h.d;
        }
        if (this.F != 1) {
            setTheme(R.style.OrderCommonStyle);
        }
        super.onCreate(bundle);
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa0ab56a37e4725de5ba6be96ed326d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa0ab56a37e4725de5ba6be96ed326d7");
        } else if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        com.sankuai.waimai.bussiness.order.base.config.a.a();
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "66bef75efbb75a3d164436f7de7f951f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "66bef75efbb75a3d164436f7de7f951f");
        } else {
            com.sankuai.waimai.platform.capacity.immersed.a.b(this, false);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6ca056f7b19a673d3a4f7f1c60c5aade", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6ca056f7b19a673d3a4f7f1c60c5aade");
        } else {
            this.h = this.g.R.a().b;
            this.i = this.g.aI.a().b;
            this.j = this.g.aG.a().b;
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "34ac6538c5bb9ea9967ca1425ba04343", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "34ac6538c5bb9ea9967ca1425ba04343");
        } else {
            this.g.X.a(new com.meituan.android.cube.pga.action.b<com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c>() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.14
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c cVar) {
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c cVar2 = cVar;
                    Object[] objArr6 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "face32e71af232589e7ce4cc9560ed6d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "face32e71af232589e7ce4cc9560ed6d");
                    } else if (cVar2 != null) {
                        OrderConfirmActivity.this.a(cVar2.a, cVar2.b);
                    }
                }
            });
            this.g.t.a((j<String>) w());
            this.g.aa.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.15
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.a
                public final void a() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9e9a06d3067405808008f83260fd6a97", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9e9a06d3067405808008f83260fd6a97");
                    } else {
                        OrderConfirmActivity.this.l();
                    }
                }
            });
            this.g.ab.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.16
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Integer num) {
                    Integer num2 = num;
                    Object[] objArr6 = {num2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2f479e0a6a8c0e50fcddac9e34f663a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2f479e0a6a8c0e50fcddac9e34f663a6");
                    } else {
                        OrderConfirmActivity.this.a(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(num2));
                    }
                }
            });
            this.g.ac.a(new com.meituan.android.cube.pga.action.b<Map<String, Object>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.17
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Map<String, Object> map) {
                    Map<String, Object> map2 = map;
                    Object[] objArr6 = {map2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "594233aa5e67a43215a770b482aebcb2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "594233aa5e67a43215a770b482aebcb2");
                    } else {
                        OrderConfirmActivity.this.u.putAll(map2);
                    }
                }
            });
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().a((com.sankuai.waimai.foundation.core.service.user.b) this);
        com.sankuai.waimai.bussiness.order.base.pay.c.a().a(this);
        this.K = com.sankuai.waimai.platform.utils.f.a(intent, "order_from_mt_other_channel", false);
        this.L = com.sankuai.waimai.platform.utils.f.a(intent, "isMultiPerson", false);
        this.N = com.sankuai.waimai.platform.utils.f.a(intent, "allowance_alliance_scenes", "");
        this.O = com.sankuai.waimai.platform.utils.f.a(intent, "ad_activity_flag", "");
        this.P = com.sankuai.waimai.platform.utils.f.a(intent, "act_page_code", "");
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "biz_scene", "");
        this.g.aX.a((j<String>) this.N);
        this.g.aY.a((j<String>) this.O);
        this.g.aZ.a((j<String>) a2);
        this.k = com.sankuai.waimai.platform.utils.f.a(intent, "poiid", -1L);
        this.l = com.sankuai.waimai.platform.utils.f.a(intent, FoodDetailNetWorkPreLoader.URI_POI_STR, "");
        com.sankuai.waimai.bussiness.order.confirm.cache.a a3 = com.sankuai.waimai.bussiness.order.confirm.cache.a.a();
        String str = this.l;
        Object[] objArr6 = {str};
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.bussiness.order.confirm.cache.a.a;
        if (PatchProxy.isSupport(objArr6, a3, changeQuickRedirect6, false, "e1572bae5ea04896045f886dc712eafa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, a3, changeQuickRedirect6, false, "e1572bae5ea04896045f886dc712eafa");
        } else {
            if (!a3.b.b.a(str)) {
                a3.b();
            }
            if (!a3.b.c.a(str)) {
                a3.c();
            }
        }
        this.D = new e(this.k);
        if (this.L) {
            this.M = (MultiPersonCart) com.sankuai.waimai.platform.utils.f.b(intent, "multiPersonCart", (Serializable) null);
        }
        this.ak = com.sankuai.waimai.platform.utils.f.a(intent, "from", "");
        this.V = "from_restaurant".equals(this.ak);
        this.X = com.sankuai.waimai.business.order.api.submit.constants.a.b(this.ak);
        this.W = "from_shopcart".equals(com.sankuai.waimai.platform.utils.f.a(intent, "from", ""));
        if (aa.a(this.l)) {
            a.AbstractC1040a b2 = new com.sankuai.waimai.bussiness.order.base.log.a().a("order_preview_poiid_invalid").b(this.ak);
            com.sankuai.waimai.platform.capacity.log.i.d(b2.c(this.l + "---" + this.k).b());
        }
        if (this.ah != null) {
            if (this.ah.h == null || this.ah.h.b == null) {
                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_data_error").b("order_data_invalied").c(this.ah.g).b());
                ae.a((Activity) this, getString(R.string.wm_order_confirm_data_error_try_afterwhile));
                finish();
                return;
            }
            a(this.ah, false);
            if (this.L) {
                SubmitOrderManager.getInstance().setToken(this.g.B.a());
            }
            Object obj = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("food_list");
            this.ae = com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.a(obj != null ? (List) obj : new ArrayList());
            if (com.sankuai.waimai.foundation.utils.d.a(this.ae)) {
                ae.a((Activity) this, getString(R.string.wm_order_confirm_no_good));
                finish();
                return;
            }
            com.sankuai.waimai.bussiness.order.base.log.b.a().a(this.ak);
            if (this.ah != null && bundle == null) {
                z = false;
            }
            this.aj = z;
            this.aa = this.ah == null ? 0.0d : this.ah.b;
            a(intent);
            com.sankuai.waimai.foundation.core.service.screenshot.a.a().a(this.I);
            com.meituan.android.bus.a.a().a(this);
            return;
        }
        com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_data_error").b("order_data_empty").c("null_data").b());
        ae.a((Activity) this, getString(R.string.wm_order_confirm_no_good));
        finish();
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ffee9a445ddc8c55041a81f0236d81f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ffee9a445ddc8c55041a81f0236d81f");
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dc6b4c9c0f8e3f7668ed776c2c3d7a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dc6b4c9c0f8e3f7668ed776c2c3d7a6");
        } else {
            super.onStart();
        }
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dd704b3c72ac3cf27d50ff342dcd2a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dd704b3c72ac3cf27d50ff342dcd2a4");
            return;
        }
        super.onResume();
        if (this.ah != null) {
            com.sankuai.meituan.takeoutnew.util.aop.h.a(s().recordStep("activity_data_ready"));
        }
        if (this.g.ag.a().b()) {
            this.g.ah.a();
        } else if (this.g.ai.a().b()) {
            this.g.aj.a();
        } else if (this.g.al.a().b()) {
            this.g.am.a();
        } else if (!this.R && this.aj && !this.g.ak.a().b()) {
            this.g.ax.a();
            if (!this.t || !this.d) {
                this.ai.postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.20
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b77bfbad4071a0b7da290ab63e3e8309", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b77bfbad4071a0b7da290ab63e3e8309");
                        } else {
                            OrderConfirmActivity.this.a(2);
                        }
                    }
                }, 0L);
            }
            this.t = false;
            this.d = false;
        } else {
            com.sankuai.waimai.platform.capacity.log.i.c(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_confirm_refresh").c("onResume_without_refresh").b());
        }
        this.R = false;
        this.aj = true;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a996047ded2709691b4def7ea0856be6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a996047ded2709691b4def7ea0856be6");
            return;
        }
        super.onPause();
        JudasManualManager.a(this);
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d4634e8fec57dbde53bd3e353a48974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d4634e8fec57dbde53bd3e353a48974");
        } else {
            super.onStop();
        }
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c17999bdc76337e37cf798d94ab19a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c17999bdc76337e37cf798d94ab19a16");
            return;
        }
        if (w().equals(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b)) {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.e();
            g.a().c();
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().b((com.sankuai.waimai.foundation.core.service.user.b) this);
        com.sankuai.waimai.bussiness.order.base.pay.c.a().b(this);
        com.sankuai.waimai.foundation.core.service.screenshot.a.a().b(this.I);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.f a2 = com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.f.a(this.g);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.f.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "00dc26ea57890aa1af78b5648c03e6c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "00dc26ea57890aa1af78b5648c03e6c8");
        } else {
            a2.c.clear();
            a2.d.clear();
            com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.f.b = null;
        }
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.bussiness.order.base.log.b.a().a((String) null);
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c205f0e7082f2c78dccc3af9bd6df8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c205f0e7082f2c78dccc3af9bd6df8");
            return;
        }
        super.onConfigurationChanged(configuration);
        if (configuration.screenWidthDp == this.E || this.ah == null) {
            return;
        }
        a(this.ah, false);
        this.E = configuration.screenWidthDp;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe8b4cf02d7b85c0c5989c740ff15b28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe8b4cf02d7b85c0c5989c740ff15b28");
            return;
        }
        super.onSaveInstanceState(bundle);
        c.a().a(this.ah);
        g a2 = g.a();
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2b7bcc33c4a02b04fd918d680522070f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2b7bcc33c4a02b04fd918d680522070f");
        } else if (a2.b != null && !a2.b.isEmpty()) {
            try {
                bundle.putString("key_poi_coupon_ap_params", g.d().toJson(a2.b));
            } catch (Throwable unused) {
            }
        }
        if (!TextUtils.isEmpty(this.p)) {
            bundle.putString("key_pay_params_hash_id", this.p);
        }
        if (!TextUtils.isEmpty(this.q)) {
            bundle.putString("key_pay_params_trade_no", this.q);
        }
        if (!TextUtils.isEmpty(this.r)) {
            bundle.putString("key_pay_params_pay_token", this.r);
        }
        if (!TextUtils.isEmpty(this.s)) {
            bundle.putString("key_pay_params_cashier_type", this.s);
        }
        if (!TextUtils.isEmpty(this.b)) {
            bundle.putString("key_pay_params_extra_data", this.b);
        }
        if (TextUtils.isEmpty(this.c)) {
            return;
        }
        bundle.putString("key_pay_params_pre_cashier_info", this.c);
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2963356e8d69d14dd968d8014d3f7b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2963356e8d69d14dd968d8014d3f7b7");
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        super.onRestoreInstanceState(bundle);
        final g a2 = g.a();
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c6a9edfeb1c8d2146ff9717ce3e963b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c6a9edfeb1c8d2146ff9717ce3e963b1");
        } else if (a2.b == null) {
            String string = bundle.getString("key_poi_coupon_ap_params");
            if (!TextUtils.isEmpty(string)) {
                try {
                    a2.b = (List) g.d().fromJson(string, new TypeToken<List<Map<String, Object>>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.helper.g.1
                    }.getType());
                } catch (Throwable unused) {
                }
            }
        }
        this.p = bundle.getString("key_pay_params_hash_id");
        this.q = bundle.getString("key_pay_params_trade_no");
        this.r = bundle.getString("key_pay_params_pay_token");
        this.s = bundle.getString("key_pay_params_cashier_type");
        this.b = bundle.getString("key_pay_params_extra_data");
        this.c = bundle.getString("key_pay_params_pre_cashier_info");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed595a19d44d1ba942132b559de1a66b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed595a19d44d1ba942132b559de1a66b")).booleanValue() : !TextUtils.isEmpty(this.p);
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean a2;
        final AddressBean addressBean;
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fdd29332b61c50a9ca0e94c0c2ba24c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fdd29332b61c50a9ca0e94c0c2ba24c");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        int i4 = -1;
        if (i2 == -1 || this.e) {
            this.t = true;
            this.e = false;
        }
        if (i != 1) {
            if (i != 3) {
                if (i != 24) {
                    if (i != 1002) {
                        switch (i) {
                            case 26:
                                if (i2 == 0 && k()) {
                                    b(i2, true);
                                    break;
                                }
                                break;
                            case 27:
                                if (k()) {
                                    try {
                                        Bundle extras = intent.getExtras();
                                        if (extras != null) {
                                            i3 = new JSONObject((String) extras.get("resultData")).optInt("pay_pattern");
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    if (i3 <= 0) {
                                        b(i2, true);
                                        break;
                                    }
                                }
                                break;
                        }
                    } else {
                        Object[] objArr2 = {Integer.valueOf(i2), intent};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ab9c0c3c22d2aac18a9f06ac04dcc9b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ab9c0c3c22d2aac18a9f06ac04dcc9b");
                        } else if (i2 == -1) {
                            String str = "";
                            String str2 = "";
                            if (intent != null) {
                                str = com.sankuai.waimai.platform.utils.f.a(intent, "resultData");
                                str2 = com.sankuai.waimai.platform.utils.f.a(intent, "appId");
                            }
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && "be7dcad4cf774fed".equals(str2)) {
                                try {
                                    AddressBackInfo addressBackInfo = (AddressBackInfo) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(str, (Class<Object>) AddressBackInfo.class);
                                    if (addressBackInfo != null) {
                                        i4 = addressBackInfo.addressOperateType;
                                        a2 = addressBackInfo.forceSave;
                                        addressBean = addressBackInfo.address;
                                    } else {
                                        addressBean = null;
                                        a2 = false;
                                    }
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            } else {
                                i4 = com.sankuai.waimai.platform.utils.f.a(intent, "waimai_addrsdk_address_operate_type", -1);
                                a2 = com.sankuai.waimai.platform.utils.f.a(intent, "waimai_addrsdk_force_save", false);
                                Serializable c = com.sankuai.waimai.platform.utils.f.c(intent, "waimai_addrsdk_address");
                                if (c instanceof AddressBean) {
                                    addressBean = (AddressBean) c;
                                }
                            }
                            if (a2 && i4 == 202) {
                                Object[] objArr3 = {addressBean};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "565b248f6e3395d5677f757d541af0fe", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "565b248f6e3395d5677f757d541af0fe");
                                } else {
                                    new RooAlertDialog.a(new ContextThemeWrapper(this, 2131558962)).b(com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_over_delivery_address_dialog_title)).a(com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_over_delivery_address_dialog_yes), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.18
                                        public static ChangeQuickRedirect a;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i5) {
                                            Object[] objArr4 = {dialogInterface, Integer.valueOf(i5)};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e561c04538837d71ce7c92756a518421", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e561c04538837d71ce7c92756a518421");
                                            } else {
                                                OrderConfirmActivity.a(OrderConfirmActivity.this, addressBean);
                                            }
                                        }
                                    }).b(com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_over_delivery_address_dialog_no), (DialogInterface.OnClickListener) null).b();
                                }
                            }
                        }
                    }
                } else if (k()) {
                    b(i2, true);
                    com.sankuai.waimai.foundation.utils.log.a.b("OrderConfirmActivity ", "代付返回 resultCode=" + i2, new Object[0]);
                }
            } else if (k()) {
                b(i2, true);
            }
        } else if (i2 == -1) {
            l();
        }
        com.meituan.android.privacy.aop.a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dedcc2e0ed8ee80e40cb0538387a7090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dedcc2e0ed8ee80e40cb0538387a7090");
            return;
        }
        if (z) {
            com.sankuai.waimai.bussiness.order.confirm.cache.a.a().d();
            com.sankuai.waimai.bussiness.order.confirm.cache.b.a().b();
        }
        StorageUtil.clearShareValue(bB_(), "netbar_address_info");
        com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(new com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.a());
        if (TextUtils.isEmpty(this.q)) {
            com.sankuai.waimai.bussiness.order.base.utils.i.a((Context) this, this.p, true, this.K, i);
            a((Activity) this);
            return;
        }
        OrderPayResultManager.handleResult(this, i, this.p, this.l, this.q, this.W, this.ae, z, new com.sankuai.waimai.business.order.api.pay.f() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.21
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.order.api.pay.f
            public final void a(Activity activity, String str, String str2) {
                Object[] objArr2 = {activity, str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3fdfde9868c289fdedf6c9193de30bf6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3fdfde9868c289fdedf6c9193de30bf6");
                    return;
                }
                com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
                if (!aa.a(str2)) {
                    if (str2.contains("mach_pro_waimai_order_middle")) {
                        str2 = str2 + "&rank_list_id=" + ListIDHelper.a.a.a();
                    }
                    com.sankuai.waimai.foundation.router.a.a(activity, str2);
                } else {
                    com.sankuai.waimai.bussiness.order.base.utils.i.a((Context) activity, str, true, OrderConfirmActivity.this.K, i);
                }
                OrderConfirmActivity.this.a(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d8bc17d56e74f2751134e485740139c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d8bc17d56e74f2751134e485740139c");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("need_finish", true);
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.setResult(-1, intent);
        activity.finish();
    }

    public final boolean b() {
        return this.F == 1;
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3163a06ac315e975540b2b07c3515ca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3163a06ac315e975540b2b07c3515ca5");
        } else if (this.F == 1 && !this.f) {
            final com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g gVar = (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g) this.g.g;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.r;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "102315985294bd161de2002bed49bd58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "102315985294bd161de2002bed49bd58");
                return;
            }
            gVar.x = new AlphaAnimation(0.95f, 0.0f);
            gVar.x.setDuration(200L);
            gVar.v.startAnimation(gVar.x);
            gVar.y = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            gVar.y.setDuration(200L);
            gVar.y.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g.43
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    Object[] objArr3 = {animation};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a14827bb40313468a49bc3f622a82721", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a14827bb40313468a49bc3f622a82721");
                    } else {
                        gVar.L.setVisibility(4);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    Object[] objArr3 = {animation};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a6beaafd69f72975b57b0bd17e515cbd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a6beaafd69f72975b57b0bd17e515cbd");
                    } else if (gVar.m() instanceof OrderConfirmActivity) {
                        gVar.w.setVisibility(4);
                        gVar.v.setAlpha(0.0f);
                        ((OrderConfirmActivity) gVar.m()).f = true;
                        gVar.l().finish();
                    }
                }
            });
            gVar.w.startAnimation(gVar.y);
        } else {
            super.finish();
            if (this.F != 1) {
                overridePendingTransition(R.anim.wm_order_confirm_page_exit_in, R.anim.wm_order_confirm_page_exit_out);
            } else {
                overridePendingTransition(0, 0);
            }
        }
    }

    @Override // android.app.Activity
    public boolean isFinishing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc163597f02e1598a02858548c214956", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc163597f02e1598a02858548c214956")).booleanValue() : super.isFinishing() || isDestroyed();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6882c294c27383c0bc62720475598df6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6882c294c27383c0bc62720475598df6");
        } else if (d()) {
        } else {
            if (this.g.aF.a().b()) {
                this.g.aE.a().b();
                return;
            }
            try {
                super.onBackPressed();
            } catch (Exception e) {
                String simpleName = getClass().getSimpleName();
                com.sankuai.waimai.foundation.utils.log.a.e(simpleName, e.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ba652dd45653e7aafa05e7c26561a2a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ba652dd45653e7aafa05e7c26561a2a")).booleanValue();
        }
        if (i == 4 && keyEvent.getAction() == 0 && d()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.sankuai.waimai.platform.cube.BasePGAActivity
    public final com.meituan.android.cube.pga.core.a f() {
        return this.g;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity
    public final com.meituan.android.cube.core.f g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "260c489f43811c616299b87bd848df0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.core.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "260c489f43811c616299b87bd848df0f");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7742fdd24c639b468e01512e08e98759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7742fdd24c639b468e01512e08e98759");
        } else {
            try {
                this.af = Typeface.createFromAsset(getAssets(), "fonts/AvenirLTPro-Medium.ttf");
            } catch (Exception e) {
                this.af = null;
                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_confirm_newfont").c(e.getMessage()).b());
            }
            if (this.af != null) {
                this.ag = true;
            }
        }
        g.a().c();
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.e();
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b = w();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "905ed7703d95faefabc6cb0f06171d4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "905ed7703d95faefabc6cb0f06171d4e");
        } else {
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.g == null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.g = new HashMap();
            }
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.d == null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.d = new HashMap();
            }
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c == null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c = new HashMap();
            }
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.e == null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.e = new HashMap();
            }
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.f == null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.f = new HashMap();
            }
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.h == null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.h = new HashMap();
            }
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.i == null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.i = new HashMap();
            }
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.j == null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.j = new HashMap();
            }
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.k == null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.k = new HashMap();
            }
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.n == null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.n = new HashMap();
            }
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.l == null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.l = new HashMap();
            }
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.m == null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.m = new ArrayList<>();
            }
        }
        this.ah = (OrderResponse) c.a().a(OrderResponse.class);
        this.g.aC.b = new com.meituan.android.cube.pga.action.d<com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e>() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.22
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "98d3d5fa8cbbc94645ab8feb85607f4d", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "98d3d5fa8cbbc94645ab8feb85607f4d") : OrderConfirmActivity.this.H;
            }
        };
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g gVar = new com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g(this.g);
        this.g.g = gVar;
        return gVar;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f989b4d19449a380b9d6b0869a08e32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f989b4d19449a380b9d6b0869a08e32");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject();
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.h != null) {
                for (String str : com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.h.keySet()) {
                    jSONObject.put(str, com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.h.get(str));
                }
            }
            if (!TextUtils.isEmpty(this.g.bj.a().a())) {
                jSONObject.put("pre_trade_no", this.g.bj.a().a());
            }
            int i = 1;
            if (this.F != 1) {
                i = 2;
            }
            jSONObject.put("wm_is_revision", i);
            hashMap.put("custom", jSONObject);
            Statistics.setValLab(AppUtil.generatePageInfoKey(this), hashMap);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        JudasManualManager.a("c_ykhs39e", this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, com.sankuai.waimai.foundation.core.base.activity.c
    public final Map<String, String> Z_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f791d4aaf6679cc7376830695dcada3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f791d4aaf6679cc7376830695dcada3d");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", "waimai_confirm_order");
        return hashMap;
    }

    private void a(Intent intent) {
        Uri.Builder builder;
        String str;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd82be0299338605a23896aac68a8adc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd82be0299338605a23896aac68a8adc");
        } else if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                builder = data.buildUpon();
            } else {
                builder = new Uri.Builder();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.k);
            builder.appendQueryParameter("poi_id", sb.toString());
            builder.appendQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR, com.sankuai.waimai.bussiness.order.base.utils.i.b(this.l));
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.i != null) {
                for (String str2 : com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.i.keySet()) {
                    builder.appendQueryParameter(str2, String.valueOf(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.i.get(str2)));
                }
            }
            builder.appendQueryParameter("newziti_abtest", this.G.aM_() ? "1" : "0");
            builder.appendQueryParameter("wm_preview_discount_abtest", "C");
            builder.appendQueryParameter("preview_commodity_abtest", "A");
            if (this.ae != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.ae.size());
                str = sb2.toString();
            } else {
                str = "0";
            }
            builder.appendQueryParameter("sku_category", str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.g.aL_());
            builder.appendQueryParameter("business_type", sb3.toString());
            builder.appendQueryParameter("is_multiple_transaction", "0");
            builder.appendQueryParameter("poi_number", "1");
            boolean b2 = com.sankuai.waimai.platform.accessibility.a.a().b();
            builder.appendQueryParameter("accessibility_switch", b2 ? "1" : "0");
            boolean z = com.sankuai.waimai.platform.accessibility.a.a().b;
            builder.appendQueryParameter("large_font", z ? "1" : "0");
            com.sankuai.waimai.foundation.utils.log.a.b(o, "reportStatus largeFontSize : %b , accessibility_switch : %b", Boolean.valueOf(z), Boolean.valueOf(b2));
            intent.setData(builder.build());
        }
    }

    public boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4baba71d9a954a5606f27be588feafa4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4baba71d9a954a5606f27be588feafa4")).booleanValue();
        }
        if (this.L) {
            com.sankuai.waimai.bussiness.order.base.a.a(this, "page_source", 4, "is_self_delivery", com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) this, "is_self_delivery", 0) == 1);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull OrderResponse orderResponse, boolean z) {
        Object[] objArr = {orderResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90370697b77efc61ff83784e742d104c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90370697b77efc61ff83784e742d104c");
            return;
        }
        this.ah = orderResponse;
        this.g.au.a((j<Boolean>) Boolean.valueOf(orderResponse.d));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.d();
        ((com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g) this.g.g).a(orderResponse.h);
        this.g.g.c(orderResponse.h);
        ((com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g) this.g.g).M();
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a();
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b();
        SubmitOrderManager.getInstance().setToken(this.g.B.a());
        if (this.aa <= 0.0d) {
            this.aa = this.g.bf.a().d() - this.g.be.a().d();
            this.Z = orderResponse.k;
        }
        q();
        if (z) {
            com.sankuai.meituan.takeoutnew.util.aop.h.a(s().recordStep("activity_data_ready"));
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc4dcd44d82527e94743a5fe56042ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc4dcd44d82527e94743a5fe56042ac7");
        } else {
            a(true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42b97bcc18bd367a41f9a940de8fd826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42b97bcc18bd367a41f9a940de8fd826");
        } else if (b(i)) {
            HashMap hashMap = new HashMap();
            hashMap.put("wm_poi_id", Long.valueOf(this.D.b));
            hashMap.put("toast", getString(R.string.wm_order_confirm_switched_original_business));
            a((Map<String, Object>) hashMap, i, z, false);
        } else {
            a(true, false, "", i, z);
        }
    }

    private boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "684378c2f1a03a6154dbfaf759182a68", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "684378c2f1a03a6154dbfaf759182a68")).booleanValue() : (i == this.g.aL_() || this.D.a(this.k)) ? false : true;
    }

    void a(boolean z, boolean z2) {
        Object[] objArr = {(byte) 1, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67fe51b0da501a6a28d78afd841c7b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67fe51b0da501a6a28d78afd841c7b23");
        } else {
            a(true, false, "");
        }
    }

    private void a(boolean z, boolean z2, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca1b538b8edb0ef1fc2a839f58577e01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca1b538b8edb0ef1fc2a839f58577e01");
        } else {
            a(z, z2, str, this.g.aL_(), true);
        }
    }

    private void a(boolean z, boolean z2, String str, int i, boolean z3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed9de4c1764dc60756cd904b19491b6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed9de4c1764dc60756cd904b19491b6a");
        } else if (!this.L && this.k == -1) {
            finish();
        } else if (this.U.c) {
            b_(this.U.a());
            a(false);
        } else {
            a(z, z2, str, e(i), a(z, z2, i, z3), false);
        }
    }

    private int e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea6abdca970046a73eb013ad5d96a56", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea6abdca970046a73eb013ad5d96a56")).intValue();
        }
        if (this.W) {
            return 4;
        }
        return i == 3 ? 1 : 0;
    }

    private void a(boolean z, boolean z2, String str, int i, Map<String, Object> map, boolean z3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), map, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de4d8bf54b0fae7392280d8ecf568d16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de4d8bf54b0fae7392280d8ecf568d16");
            return;
        }
        com.sankuai.waimai.bussiness.order.confirm.request.update.a aVar = new com.sankuai.waimai.bussiness.order.confirm.request.update.a(this);
        aVar.b = z2;
        com.sankuai.waimai.bussiness.order.confirm.request.update.a a2 = aVar.a(this.i);
        a2.f = this.U;
        a2.h = this.L;
        a2.g = this.ao;
        b.C0904b c0904b = new b.C0904b(this.k, this.l, i, this.L, this.K, -1, z, z2, str, this.V, this.ae, z3, this.X);
        com.sankuai.waimai.bussiness.order.confirm.request.b a3 = com.sankuai.waimai.bussiness.order.confirm.request.b.a(this.k, z ? 1 : 0, map, w());
        a3.e = c0904b;
        a3.f = a2;
        a3.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, int i, boolean z, boolean z2) {
        Object[] objArr = {map, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03038489d89e3b4b77b458842c3f9541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03038489d89e3b4b77b458842c3f9541");
        } else if (map == null) {
        } else {
            Object obj = map.get("wm_poi_id");
            if (obj instanceof Long) {
                long j = this.k;
                long longValue = ((Long) obj).longValue();
                if (longValue == j) {
                    return;
                }
                this.D.a(map);
                Map<String, Object> a2 = a(true, false, i, z);
                this.D.a(j, a2);
                a(j);
                b(longValue);
                if (this.D.a(j)) {
                    a(map, a2);
                } else {
                    c(i, z2);
                }
            }
        }
    }

    private void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c61c24a7b034534e1560a2886b5daee0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c61c24a7b034534e1560a2886b5daee0");
            return;
        }
        e.a d = this.D.d(j);
        d.b();
        d.b = this.N;
        d.c = this.O;
        d.d = this.L;
        d.f = this.M;
        d.e = this.W;
        d.g = this.ab;
        d.h = this.ad;
        d.i = this.ae;
        d.j.clear();
        d.k.clear();
        d.j.putAll(this.u);
        d.k.putAll(this.v);
    }

    private void c(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a7d653618c2de7b975087d41f9469d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a7d653618c2de7b975087d41f9469d");
            return;
        }
        long j = this.D.b;
        HashMap hashMap = new HashMap(this.D.b(j));
        hashMap.putAll(this.D.a());
        if (z) {
            hashMap.putAll(this.D.c(j));
        }
        hashMap.put("medical_recommend", Boolean.TRUE);
        hashMap.put("medical_recommend_poi", Boolean.FALSE);
        hashMap.put("medical_recommend_action", 2);
        hashMap.put("business_type", Integer.valueOf(i));
        if (i == 1 || i == 2) {
            hashMap.put("recipient_phone", this.g.Y.a().b.toString());
        }
        a(true, false, "", e(this.g.aL_()), hashMap, true);
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07f5d3b39e13440da6193809cf1a5995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07f5d3b39e13440da6193809cf1a5995");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(map2);
        hashMap.putAll(map);
        Map<String, Object> b2 = this.D.b(hashMap);
        b2.put("medical_recommend", Boolean.FALSE);
        b2.put("medical_recommend_poi", Boolean.TRUE);
        b2.put("medical_recommend_action", 1);
        a(true, false, "", e(this.g.aL_()), b2, true);
    }

    private void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e98d5e56ef54bdc6e32669d5f4865ccb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e98d5e56ef54bdc6e32669d5f4865ccb");
            return;
        }
        e.a d = this.D.d(j);
        this.k = j;
        this.N = d.b;
        this.O = d.c;
        this.g.aX.a((j<String>) this.N);
        this.g.aY.a((j<String>) this.O);
        this.L = d.d;
        this.M = d.f;
        this.W = d.e;
        this.ab = d.g;
        this.ad = d.h;
        this.ae = d.i;
        this.u.clear();
        this.u.putAll(d.j);
        this.v.clear();
        this.v.putAll(d.k);
    }

    @NonNull
    private Map<String, Object> a(boolean z, boolean z2, int i, boolean z3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "157e57f565fc6b1a51da697ae88ea2d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "157e57f565fc6b1a51da697ae88ea2d8");
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c();
        HashMap hashMap = new HashMap();
        hashMap.putAll(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.d);
        hashMap.putAll(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.e);
        if (this.g.aL_() != i) {
            hashMap.put("expected_arrival_time", 0);
        }
        if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.containsKey("foodlist")) {
            hashMap.put("foodlist", com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("foodlist"));
        }
        a(hashMap);
        if (i == 1) {
            hashMap.put("additional_bargain_list", new ArrayList());
            hashMap.put("ap_params", new ArrayList());
            hashMap.put("insurance_selected", Boolean.FALSE);
            hashMap.put("gift_insurance", 0);
            if (this.u.containsKey("no_product_reminds_selected")) {
                this.u.remove("no_product_reminds_selected");
                hashMap.remove("no_product_reminds_selected");
                this.g.an.a((com.meituan.android.cube.pga.common.b<Map<String, Object>>) hashMap);
            }
        }
        hashMap.put("submit_once_again", Integer.valueOf(z2 ? 1 : 0));
        if (z) {
            hashMap.put("expected_arrival_info", new ExpectedArrivalInfoInput(this.g.aw.a().a()));
        }
        hashMap.put("business_type", Integer.valueOf(i));
        if (i == 1 || i == 2) {
            PhoneInfo phoneInfo = (PhoneInfo) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(com.sankuai.waimai.foundation.location.v2.d.a().toJson(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("phone")), (Class<Object>) PhoneInfo.class);
            hashMap.put("recipient_phone", phoneInfo != null ? phoneInfo.toString() : "");
        }
        if (!z3) {
            hashMap.put("recipient_phone", "");
            hashMap.put("recipient_address", "");
        }
        if (this.L) {
            hashMap.put("cart_id", this.M.getShoppingCart().getId());
        } else {
            hashMap.put("cart_id", "");
        }
        if (com.sankuai.waimai.bussiness.order.base.utils.i.b(this.l, this.ac) || this.k == this.ab) {
            hashMap.put("foodlist", com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.c(this.ae));
        }
        hashMap.put("allowance_alliance_scenes", this.N);
        hashMap.put("ad_activity_flag", this.O);
        hashMap.put("ignore_address_recommend", Boolean.valueOf(com.sankuai.waimai.business.order.submit.b.a()));
        hashMap.put("need_recommend_pickup_cabinet", Integer.valueOf(this.g.aA.a().c()));
        hashMap.put("medical_recommend", Boolean.valueOf(this.D.a(this.k)));
        hashMap.put("medical_recommend_poi", Boolean.valueOf(!this.D.a(this.k)));
        if (!aa.a(this.P)) {
            hashMap.put("act_page_code", this.P);
        }
        return hashMap;
    }

    private void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bc36cda29edac7e3e3abb6433da5673", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bc36cda29edac7e3e3abb6433da5673");
            return;
        }
        List list = (List) map.get("ap_params");
        if (this.am && this.an != null && this.an.size() > 0) {
            for (Map<String, Object> map2 : this.an) {
                if (list.contains(map2)) {
                    list.remove(map2);
                }
            }
            this.am = false;
            this.an.clear();
        }
        if (!this.al) {
            map.put("ap_params", list);
        } else if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Map map3 = (Map) list.get(i);
                if (map3.containsKey("user_drop_activity")) {
                    break;
                }
                map3.put("user_drop_activity", Boolean.TRUE);
                list.remove(i);
                list.add(i, map3);
            }
            map.put("ap_params", list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0efe722ca4847d14dbace68090ce904", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0efe722ca4847d14dbace68090ce904");
            return;
        }
        AddressItem addressItem = (AddressItem) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(com.sankuai.waimai.foundation.location.v2.d.a().toJson(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("submit_address")), (Class<Object>) AddressItem.class);
        if (addressItem != null && addressItem.recommendType == 2) {
            RooAlertDialog.a a2 = new RooAlertDialog.a(new ContextThemeWrapper(bB_(), 2131558962)).a(R.string.wm_order_confirm_suggest_recommend_type_title);
            a2.b(addressItem.addrBrief + StringUtil.SPACE + addressItem.addrBuildingNum).a(R.string.wm_order_confirm_cashier_ok, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e94c21415d3e1dd2fce24c02c1bbcf4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e94c21415d3e1dd2fce24c02c1bbcf4");
                        return;
                    }
                    dialogInterface.dismiss();
                    OrderConfirmActivity.this.n();
                    JudasManualManager.a("b_27Z6u").a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(OrderConfirmActivity.this.k, OrderConfirmActivity.this.l)).a("c_ykhs39e").a(OrderConfirmActivity.this).a();
                }
            }).b(R.string.wm_order_confirm_cashier_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "372e7001d089c94140b7f3e46ba8c988", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "372e7001d089c94140b7f3e46ba8c988");
                        return;
                    }
                    JudasManualManager.a("b_8k9S9").a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(OrderConfirmActivity.this.k, OrderConfirmActivity.this.l)).a("c_ykhs39e").a(OrderConfirmActivity.this).a();
                    dialogInterface.dismiss();
                    OrderConfirmActivity.this.a(true);
                }
            }).a(true).b();
            JudasManualManager.b("b_BHMKt").a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(this.k, this.l)).a("c_ykhs39e").a(this).a();
            return;
        }
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        com.sankuai.waimai.bussiness.order.confirm.submit.c a2;
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03338867928c73703a7101fcb6446c9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03338867928c73703a7101fcb6446c9d");
            return;
        }
        try {
            AddressItem addressItem = this.g.af.a().b;
            if (addressItem == null) {
                a(true);
                this.h.smoothScrollToPosition(0);
                return;
            }
            com.sankuai.waimai.contextual.computing.storage.db.a.a().a(addressItem.id, com.sankuai.waimai.platform.b.A().j());
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.k != null && !com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.k.isEmpty()) {
                a(true);
                this.g.M.a((com.meituan.android.cube.pga.common.b<Map<String, String>>) com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.k);
                return;
            }
            int aL_ = this.g.aL_();
            PhoneInfo phoneInfo = (PhoneInfo) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(com.sankuai.waimai.foundation.location.v2.d.a().toJson(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("phone")), (Class<Object>) PhoneInfo.class);
            if ((aL_ != 1 && aL_ != 2) || (phoneInfo != null && (phoneInfo.valid() || com.sankuai.waimai.platform.model.c.a().b() == 1))) {
                if (!this.L && com.sankuai.waimai.foundation.utils.d.a(this.ae)) {
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("submit_order").b("goods_empty").b());
                    com.sankuai.waimai.bussiness.order.base.log.b.a().a("order_submit_empty_list", com.sankuai.waimai.bussiness.order.base.log.b.a(this.k, this.l, ""), "");
                    finish();
                    return;
                }
                int intValue = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("template_type") != null ? ((Integer) com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("template_type")).intValue() : 0;
                if (intValue == 1 || intValue == 2) {
                    PhoneInfo phoneInfo2 = (PhoneInfo) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(com.sankuai.waimai.foundation.location.v2.d.a().toJson(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("booking_phone")), (Class<Object>) PhoneInfo.class);
                    if (phoneInfo2 != null && !phoneInfo2.isEmpty()) {
                        if (!phoneInfo2.valid()) {
                            d(R.string.wm_order_confirm_remark_error_empty_phone);
                            a(true);
                            return;
                        }
                    }
                    d(R.string.wm_order_confirm_remark_error_phone);
                    a(true);
                    return;
                }
                int c = this.g.bl.a().c();
                if (!this.g.av.a().b()) {
                    a(true);
                    return;
                }
                if ((com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.containsKey("need_choose_tableware") ? ((Boolean) com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("need_choose_tableware")).booleanValue() : false) && com.sankuai.waimai.platform.model.c.a().b() == 1) {
                    this.g.aM.a((com.meituan.android.cube.pga.common.b<Void>) null);
                    a(true);
                    return;
                }
                ArrayList<OrderFoodInput> c2 = com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.c(this.ae);
                if (!this.L) {
                    Object[] objArr2 = {c2};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.base.utils.e.a;
                    if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3509b5cb1ac49175f8ee9b2f22f855c1", RobustBitConfig.DEFAULT_VALUE)) {
                        if (c2 != null && c2.size() > 0) {
                            Iterator<OrderFoodInput> it = c2.iterator();
                            while (it.hasNext()) {
                                OrderFoodInput next = it.next();
                                if (next != null) {
                                    if (next.id > 0) {
                                        if (next.count <= 0) {
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                        z = false;
                        break;
                    }
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3509b5cb1ac49175f8ee9b2f22f855c1")).booleanValue();
                    if (!z) {
                        com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("submit_order").b("order_invalid").b());
                        com.sankuai.waimai.bussiness.order.base.log.b.a().a("order_submit_order_invalid", com.sankuai.waimai.bussiness.order.base.log.b.a(this.k, this.l, ""), com.sankuai.waimai.bussiness.order.base.log.b.a(this.ae));
                        d(R.string.wm_order_confirm_submit_order_invalid);
                        return;
                    }
                }
                a.C0751a c0751a = new a.C0751a();
                if (!this.g.O.b(c0751a)) {
                    if (c0751a.a) {
                        a(true);
                    }
                    if (!TextUtils.isEmpty(c0751a.c)) {
                        b_(c0751a.c);
                    }
                    if (c0751a.b) {
                        finish();
                        return;
                    }
                    return;
                } else if (this.g.P.b(new a.C0751a())) {
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) bB_(), "wm_order_pay_type", c);
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) bB_(), "wm_order_quick_pay_type", this.g.bl.a().c());
                    HashMap hashMap = new HashMap();
                    hashMap.putAll(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.g);
                    if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.containsKey("foodlist")) {
                        hashMap.put("foodlist", com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("foodlist"));
                    }
                    a(hashMap);
                    hashMap.put("confirm_submit", Integer.valueOf(this.Q ? 1 : 0));
                    if (aL_ == 1) {
                        hashMap.put("additional_bargain_list", new ArrayList());
                        hashMap.put("ap_params", new ArrayList());
                        hashMap.put("insurance_selected", Boolean.FALSE);
                        hashMap.put("gift_insurance", 0);
                    }
                    hashMap.put("business_type", Integer.valueOf(aL_));
                    if (this.g.aL_() == 1 || this.g.aL_() == 2) {
                        hashMap.put("recipient_phone", phoneInfo.toString());
                    }
                    if (this.L) {
                        hashMap.put("cart_id", this.M.getShoppingCart().getId());
                    }
                    hashMap.put("allowance_alliance_scenes", this.N);
                    hashMap.put("ad_activity_flag", this.O);
                    if (this.J) {
                        hashMap.put("payment_type", 4);
                        hashMap.put("pay_by_friend", Boolean.TRUE);
                    }
                    hashMap.put("kuaidi_delivery_alert", Integer.valueOf(!this.T ? 1 : 0));
                    hashMap.put("unpl", com.sankuai.waimai.platform.capacity.persistent.sp.a.b(bB_().getApplicationContext(), "unpl", ""));
                    hashMap.put("medical_recommend_poi", Boolean.valueOf(!this.D.a(this.k)));
                    if (!TextUtils.isEmpty(this.C)) {
                        try {
                            Map<String, Object> b2 = com.sankuai.waimai.pouch.util.c.b(this.C);
                            if (b2 != null) {
                                Iterator<Map.Entry<String, Object>> it2 = b2.entrySet().iterator();
                                while (it2.hasNext()) {
                                    Map.Entry<String, Object> next2 = it2.next();
                                    if (next2 != null && !(next2.getValue() instanceof String)) {
                                        it2.remove();
                                    }
                                }
                            }
                            if (b2 != null && !b2.isEmpty()) {
                                hashMap.put("order_snap", com.sankuai.waimai.pouch.util.c.a(b2));
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (!aa.a(this.P)) {
                        hashMap.put("act_page_code", this.P);
                    }
                    if (this.X) {
                        hashMap.put("submit_scene", 1);
                    }
                    Object[] objArr3 = {hashMap};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3c3ecb6835044dea94d13e79f8a49b9e", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (com.sankuai.waimai.bussiness.order.confirm.submit.c) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3c3ecb6835044dea94d13e79f8a49b9e");
                    } else {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("data", new Gson().toJson(hashMap));
                        if (this.W) {
                            Object[] objArr4 = {hashMap2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a4f94092cf06522c7bc235878ebd8845", RobustBitConfig.DEFAULT_VALUE)) {
                                a2 = (com.sankuai.waimai.bussiness.order.confirm.submit.c) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a4f94092cf06522c7bc235878ebd8845");
                            } else {
                                com.sankuai.waimai.bussiness.order.confirm.submit.f fVar = new com.sankuai.waimai.bussiness.order.confirm.submit.f();
                                fVar.j = this.ap;
                                c.a aVar = new c.a(this);
                                aVar.b = hashMap2;
                                aVar.c = w();
                                c.a a3 = aVar.a(this.k);
                                a3.d = this.l;
                                a2 = a3.a(fVar);
                            }
                        } else if (this.g.aL_() == 3) {
                            Object[] objArr5 = {hashMap2};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "32c209eef4f501ab0c9024f967cec9e3", RobustBitConfig.DEFAULT_VALUE)) {
                                a2 = (com.sankuai.waimai.bussiness.order.confirm.submit.c) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "32c209eef4f501ab0c9024f967cec9e3");
                            } else {
                                com.sankuai.waimai.bussiness.order.confirm.submit.e eVar = new com.sankuai.waimai.bussiness.order.confirm.submit.e();
                                eVar.j = this.L;
                                eVar.k = this.V;
                                eVar.l = this.ap;
                                c.a aVar2 = new c.a(this);
                                aVar2.b = hashMap2;
                                aVar2.c = w();
                                c.a a4 = aVar2.a(this.k);
                                a4.d = this.l;
                                a2 = a4.a(eVar);
                            }
                        } else {
                            Object[] objArr6 = {hashMap2};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "19b58a58bd75816bf4d59455f93c4538", RobustBitConfig.DEFAULT_VALUE)) {
                                a2 = (com.sankuai.waimai.bussiness.order.confirm.submit.c) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "19b58a58bd75816bf4d59455f93c4538");
                            } else {
                                com.sankuai.waimai.bussiness.order.confirm.submit.d dVar = new com.sankuai.waimai.bussiness.order.confirm.submit.d();
                                dVar.j = this.L;
                                dVar.k = this.V;
                                dVar.l = this.X;
                                dVar.m = this.ap;
                                c.a aVar3 = new c.a(this);
                                aVar3.b = hashMap2;
                                aVar3.c = w();
                                c.a a5 = aVar3.a(this.k);
                                a5.d = this.l;
                                a2 = a5.a(dVar);
                            }
                        }
                    }
                    a2.a();
                    return;
                } else {
                    return;
                }
            }
            d(R.string.wm_order_confirm_error_self_delivery_phone);
            a(true);
            this.h.smoothScrollToPosition(0);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b("error", e.getMessage(), new Object[0]);
            b_(getString(R.string.wm_order_confirm_wrong_param_retry));
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("submit_order").b("submit_params_error").c(e.getMessage()).b());
            com.sankuai.waimai.bussiness.order.base.log.b.a().a("order_submit_params_error", com.sankuai.waimai.bussiness.order.base.log.b.a(this.k, this.l, ""), e.getMessage());
        }
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPTags
    @NonNull
    public Map<String, Object> ffpTags() {
        String str;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29d7928d50adbdead27db507f1aa0294", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29d7928d50adbdead27db507f1aa0294");
        }
        HashMap hashMap = new HashMap();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17f2dc6476b46f47ca8f69e233c3eb1d", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17f2dc6476b46f47ca8f69e233c3eb1d")).booleanValue();
        } else if (this.ah != null && this.ah.h != null) {
            m mVar = this.ah.h;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = m.a;
            if (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "c8189b7f696022014b03fc732d724750", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "c8189b7f696022014b03fc732d724750")).booleanValue();
            } else {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = m.a;
                if (PatchProxy.isSupport(objArr4, mVar, changeQuickRedirect4, false, "027005cd9fb498150579462c97f268c9", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr4, mVar, changeQuickRedirect4, false, "027005cd9fb498150579462c97f268c9");
                } else {
                    if (mVar.b != null) {
                        Object obj = mVar.b.get("biz_line");
                        if (obj instanceof String) {
                            str = (String) obj;
                        }
                    }
                    str = "";
                }
                z = "health".equals(str);
            }
        }
        if (z) {
            hashMap.put("__ffpdp", "003");
        } else if (this.g.H.a().intValue() == 2) {
            hashMap.put("__ffpdp", "002");
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements com.sankuai.waimai.business.order.api.pay.c {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {OrderConfirmActivity.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc4c30e62ec29d0ceb208daeff634cc0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc4c30e62ec29d0ceb208daeff634cc0");
            }
        }

        @Override // com.sankuai.waimai.business.order.api.pay.c
        public final void a(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b43ea33652382ea479c048cef5d38b7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b43ea33652382ea479c048cef5d38b7a");
                return;
            }
            b(str);
            OrderConfirmActivity.this.b(-1, true);
        }

        @Override // com.sankuai.waimai.business.order.api.pay.c
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adf7068013de468ca979b36a04bee3d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adf7068013de468ca979b36a04bee3d9");
            } else {
                b(str);
            }
        }

        private void b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3894672d51265c8eaad9f1e597a26999", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3894672d51265c8eaad9f1e597a26999");
            } else {
                OrderConfirmActivity.this.p = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b extends b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.order.api.model.d>> {
        public static ChangeQuickRedirect a;
        private final String c;

        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            Object[] objArr = {baseResponse};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0ce58e13af6a067cc833b1cd324c243", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0ce58e13af6a067cc833b1cd324c243");
            } else if (baseResponse != null && baseResponse.code == 0 && baseResponse.data != 0) {
                if (((com.sankuai.waimai.business.order.api.model.d) baseResponse.data).j == 3) {
                    a(((com.sankuai.waimai.business.order.api.model.d) baseResponse.data).c);
                    return;
                }
                String str = ((com.sankuai.waimai.business.order.api.model.d) baseResponse.data).c;
                String str2 = ((com.sankuai.waimai.business.order.api.model.d) baseResponse.data).g;
                if (!OrderConfirmActivity.this.k() || ((com.sankuai.waimai.business.order.api.model.d) baseResponse.data).l != 1) {
                    OrderConfirmActivity.this.p = this.c;
                    if (!TextUtils.isEmpty(str)) {
                        OrderConfirmActivity.this.q = str;
                    }
                    com.sankuai.waimai.platform.capacity.pay.a.a(OrderConfirmActivity.this, 3, str, str2);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    OrderConfirmActivity.this.q = str;
                }
                com.sankuai.waimai.platform.capacity.pay.a.a(OrderConfirmActivity.this, 3, str, str2, OrderConfirmActivity.this.s, OrderConfirmActivity.this.b, OrderConfirmActivity.this.c);
            } else {
                a("");
            }
        }

        private b(String str) {
            Object[] objArr = {OrderConfirmActivity.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e875cc1f8505ce28e28a81f78eb84e8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e875cc1f8505ce28e28a81f78eb84e8");
            } else {
                this.c = str;
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf8920eb1ad4293bae7648ffbc2a68e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf8920eb1ad4293bae7648ffbc2a68e4");
            } else {
                a("");
            }
        }

        @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b, rx.e
        public final void onCompleted() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a127dac56079b368b57ba2f067fefca0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a127dac56079b368b57ba2f067fefca0");
            } else {
                OrderConfirmActivity.this.v();
            }
        }

        private void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e80a5ddefce2e2e00674178a3bb3d0e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e80a5ddefce2e2e00674178a3bb3d0e");
                return;
            }
            OrderConfirmActivity.this.p = this.c;
            if (!TextUtils.isEmpty(str)) {
                OrderConfirmActivity.this.q = str;
            }
            OrderConfirmActivity.this.b(-1, true);
        }
    }

    private boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67afb68d53642e75630647dc07765b74", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67afb68d53642e75630647dc07765b74")).booleanValue() : com.sankuai.waimai.platform.utils.f.a(getIntent(), "com.sankuai.meituan.takeoutnew.ui.poi.shop.helper.RestaurantJumpUtils", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "363a2bba6ed22e836d445a4a3d298860", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "363a2bba6ed22e836d445a4a3d298860");
        } else if (this.i == null) {
            finish();
        } else {
            a(false);
            this.i.setOnClickListener(this.aq);
            this.j.setOnClickListener(this.aq);
            if (this.g.aL_() == 2) {
                r();
                a(true);
            } else if (this.Z <= 0.0d) {
                r();
                a(true);
            } else if (y() && this.Z > 0.0d) {
                this.g.aK.a((com.meituan.android.cube.pga.common.b<String>) getString(R.string.wm_order_confirm_dealInfo_submit_shortMoney, new Object[]{h.a(this.Z - this.aa)}));
            } else {
                r();
                a(true);
            }
        }
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04d5f24633ca623a03158878a2194152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04d5f24633ca623a03158878a2194152");
        } else if (this.g.bl.a().c() == 3) {
            this.g.aK.a((com.meituan.android.cube.pga.common.b<String>) getString(R.string.quick_payment_string));
        } else if (this.g.bl.a().c() == 5) {
            this.g.aK.a((com.meituan.android.cube.pga.common.b<String>) getString(R.string.week_payment_string));
        } else {
            this.g.aJ.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "814ac1ae6076d0fd0019d028c58b69f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "814ac1ae6076d0fd0019d028c58b69f0");
            return;
        }
        this.i.setEnabled(z);
        if (this.j != null) {
            this.j.setEnabled(z);
            this.g.aH.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.valueOf(z));
        }
    }

    private boolean y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ebec7273177f62e3a7b39d95c022e3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ebec7273177f62e3a7b39d95c022e3f")).booleanValue();
        }
        if (this.L) {
            return !h.e(Double.valueOf(this.M.getShoppingCart().getOriginPrice()), Double.valueOf(this.M.getPoiInfo().getMinPrice()));
        }
        return h.b(Double.valueOf(this.aa), Double.valueOf(this.Z));
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d2ce4de3b8f55223b1c8be03a10fff9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d2ce4de3b8f55223b1c8be03a10fff9");
            return;
        }
        a(false);
        String valueOf = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("mTimeTip") != null ? String.valueOf(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("mTimeTip")) : null;
        if (TextUtils.isEmpty(valueOf)) {
            k.a("/order/submit", Statistics.getChannel().getSeq());
            l();
            return;
        }
        Object[] objArr2 = {valueOf};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25ae56ede8dfc552088cb04c0ee9d2b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25ae56ede8dfc552088cb04c0ee9d2b1");
        } else {
            new CustomDialog.a(this).a(b() ? R.style.WmOrderDialogWindow : -1).b(valueOf).a(R.string.wm_order_base_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.13
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6b6f5af3f0197cbcaa62e916a6d86736", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6b6f5af3f0197cbcaa62e916a6d86736");
                        return;
                    }
                    dialogInterface.dismiss();
                    OrderConfirmActivity.this.a(true);
                }
            }).b(R.string.wm_order_confirm_continue_order, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity.11
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7e2da13a13fbe9158082cbcecb19119e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7e2da13a13fbe9158082cbcecb19119e");
                    } else {
                        OrderConfirmActivity.this.l();
                    }
                }
            }).a(false).b();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a980a0960369ac3b3a604a588ee4d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a980a0960369ac3b3a604a588ee4d7");
        } else if (aVar == b.a.LOGIN && this.S) {
            l();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf531da8a490f49ab8eebf789f31d04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf531da8a490f49ab8eebf789f31d04");
        } else if (enumC0948b == b.EnumC0948b.PHONE && k()) {
            this.R = true;
            com.sankuai.waimai.platform.capacity.pay.a.a(this, 3, this.q, this.r);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onOrderCollect(CollectOrder.OrderCollectEvent orderCollectEvent) {
        Object[] objArr = {orderCollectEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92435476547f8fb3659c5d7ce478f5b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92435476547f8fb3659c5d7ce478f5b7");
        } else if (orderCollectEvent != null) {
            List<GoodsSpu> goodsSpus = orderCollectEvent.getGoodsSpus();
            if (com.sankuai.waimai.foundation.utils.b.b(goodsSpus)) {
                return;
            }
            List<OrderedFood> list = this.g.aT.a().b;
            ArrayList arrayList = new ArrayList();
            for (GoodsSpu goodsSpu : goodsSpus) {
                arrayList.add(a(goodsSpu, list));
            }
            List<OrderedFood> a2 = a(arrayList, list);
            if (com.sankuai.waimai.foundation.utils.d.a(a2)) {
                return;
            }
            this.ab = NumberUtils.parseLong(orderCollectEvent.getPoiId(), 0L);
            this.ac = orderCollectEvent.getPoiIdStr();
            this.ad = a2;
            this.ae = com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.a(a2);
            this.Y = true;
        }
    }

    private com.sankuai.waimai.bussiness.order.confirm.collect.model.a a(GoodsSpu goodsSpu, List<OrderedFood> list) {
        Object[] objArr = {goodsSpu, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "181ad159b34e775e697b6aa83881a114", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.bussiness.order.confirm.collect.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "181ad159b34e775e697b6aa83881a114");
        }
        com.sankuai.waimai.bussiness.order.confirm.collect.model.a aVar = new com.sankuai.waimai.bussiness.order.confirm.collect.model.a();
        aVar.a(goodsSpu);
        if (list != null) {
            for (OrderedFood orderedFood : list) {
                if (a(orderedFood.spu, goodsSpu)) {
                    if (aVar.j < 0) {
                        aVar.j = orderedFood.getCartId();
                    } else {
                        aVar.j = Math.min(orderedFood.getCartId(), aVar.j);
                    }
                    aVar.d += orderedFood.count;
                }
            }
        }
        if (aVar.j < 0) {
            aVar.j = 0;
        }
        aVar.e = goodsSpu.addCount;
        return aVar;
    }

    public Map<String, Object> a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a3dc81089418a9dfba0c7270f464151", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a3dc81089418a9dfba0c7270f464151");
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap2.put("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(j, str));
        hashMap2.put("order_mark", this.g.at.a().b);
        arrayList.add(hashMap2);
        hashMap.put("order_mark", arrayList);
        return hashMap;
    }

    private List<OrderedFood> a(List<com.sankuai.waimai.bussiness.order.confirm.collect.model.a> list, List<OrderedFood> list2) {
        boolean z;
        int i = 2;
        char c = 0;
        char c2 = 1;
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43ad26c3af35ed0da52e3cae4352d4aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43ad26c3af35ed0da52e3cae4352d4aa");
        }
        ArrayList<OrderedFood> arrayList = new ArrayList();
        for (com.sankuai.waimai.bussiness.order.confirm.collect.model.a aVar : list) {
            if (aVar.e != 0) {
                aVar.a();
                arrayList.add(aVar.b);
            }
        }
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            if (list2 != null) {
                Iterator<OrderedFood> it = list2.iterator();
                while (it.hasNext()) {
                    OrderedFood next = it.next();
                    boolean z2 = false;
                    for (OrderedFood orderedFood : arrayList) {
                        Object[] objArr2 = new Object[i];
                        objArr2[c] = next;
                        objArr2[c2] = orderedFood;
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb93c0e270365688a85af198b293ed11", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb93c0e270365688a85af198b293ed11")).booleanValue();
                        } else {
                            z = next != null && orderedFood != null && a(next.spu, orderedFood.spu) && next.getCartId() == orderedFood.getCartId();
                        }
                        if (z) {
                            orderedFood.setCount(orderedFood.getCount() + next.getCount());
                            i = 2;
                            c = 0;
                            c2 = 1;
                            z2 = true;
                        } else {
                            i = 2;
                            c = 0;
                            c2 = 1;
                        }
                    }
                    if (!z2) {
                        arrayList2.add(next);
                    }
                    i = 2;
                    c = 0;
                    c2 = 1;
                }
            }
            arrayList2.addAll(arrayList);
            return arrayList2;
        }
        return null;
    }

    private boolean a(GoodsSpu goodsSpu, GoodsSpu goodsSpu2) {
        Object[] objArr = {goodsSpu, goodsSpu2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32eedd87c53af791c1e007b6f29e717", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32eedd87c53af791c1e007b6f29e717")).booleanValue() : (goodsSpu == null || goodsSpu2 == null || com.sankuai.waimai.foundation.utils.b.b(goodsSpu.skus) || com.sankuai.waimai.foundation.utils.b.b(goodsSpu2.skus) || goodsSpu.id != goodsSpu2.id || goodsSpu.skus.get(0).id != goodsSpu2.skus.get(0).id) ? false : true;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity
    /* renamed from: i */
    public final com.meituan.android.cube.pga.block.a j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f20644d9ebcbcda1fd74884c6d58837", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f20644d9ebcbcda1fd74884c6d58837") : this.g.g;
    }
}
