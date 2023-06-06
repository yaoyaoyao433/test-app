package com.sankuai.waimai.business.im.common.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.widget.Space;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.im.api.WaimaiIMService;
import com.sankuai.waimai.business.im.common.plugin.IMInputEditorPlugin;
import com.sankuai.waimai.business.im.common.utils.d;
import com.sankuai.waimai.business.im.model.RiderImInfo;
import com.sankuai.waimai.business.im.model.f;
import com.sankuai.waimai.business.im.model.g;
import com.sankuai.waimai.business.im.model.i;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.mach.utils.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmRiderSendPanelAdapter extends IMSendPanelAdapter {
    public static ChangeQuickRedirect f;
    public Handler g;
    private final long h;
    private View i;
    private boolean j;
    private Context k;
    private View m;
    private EditText n;
    private boolean o;
    private boolean p;
    private String q;
    private View r;
    private List<RiderImInfo.a> s;
    private RecyclerView t;
    private a u;
    private com.sankuai.waimai.business.im.callback.a v;

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public final int a(Context context) {
        return R.layout.wm_im_rider_send_panel_input_bar;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter
    public final boolean a() {
        return true;
    }

    public static /* synthetic */ void a(WmRiderSendPanelAdapter wmRiderSendPanelAdapter, List list) {
        f fVar;
        g.a aVar;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, wmRiderSendPanelAdapter, changeQuickRedirect, false, "f4af587fad1350ce92271676e9966831", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wmRiderSendPanelAdapter, changeQuickRedirect, false, "f4af587fad1350ce92271676e9966831");
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            fVar = null;
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = (g.a) it.next();
            if (aVar != null && aVar.b == 3) {
                break;
            }
        }
        if (aVar != null && !TextUtils.isEmpty(aVar.d)) {
            fVar = (f) b.a().fromJson(aVar.d, (Class<Object>) f.class);
        }
        f fVar2 = fVar;
        if (fVar2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, wmRiderSendPanelAdapter, changeQuickRedirect2, false, "6855848ff0d3f12b797566cc0f4f245f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, wmRiderSendPanelAdapter, changeQuickRedirect2, false, "6855848ff0d3f12b797566cc0f4f245f");
            } else if (d.a(wmRiderSendPanelAdapter.k, "_float_address_") <= 0) {
                d.a(wmRiderSendPanelAdapter.k, "_float_address_", 1);
                if (wmRiderSendPanelAdapter.v != null) {
                    wmRiderSendPanelAdapter.v.a();
                }
                wmRiderSendPanelAdapter.i.setVisibility(0);
                wmRiderSendPanelAdapter.r.setVisibility(8);
                com.sankuai.waimai.imbase.configuration.a.a().a((short) 1001, R.style.wm_im_theme_edit_address);
                wmRiderSendPanelAdapter.a(false);
                wmRiderSendPanelAdapter.g.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.im.common.adapter.WmRiderSendPanelAdapter.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "abe24a31582f49896112f1c0c4768f9a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "abe24a31582f49896112f1c0c4768f9a");
                        } else {
                            WmRiderSendPanelAdapter.this.d();
                        }
                    }
                }, MetricsAnrManager.ANR_THRESHOLD);
            }
            ImageView imageView = (ImageView) wmRiderSendPanelAdapter.i.findViewById(R.id.auto_answer_edit_address_icon);
            Space space = (Space) wmRiderSendPanelAdapter.i.findViewById(R.id.auto_answer_edit_address_icon_space);
            TextView textView = (TextView) wmRiderSendPanelAdapter.i.findViewById(R.id.auto_answer_edit_address_content);
            TextView textView2 = (TextView) wmRiderSendPanelAdapter.i.findViewById(R.id.auto_answer_edit_address_edit_name);
            if (TextUtils.isEmpty(fVar2.b)) {
                imageView.setVisibility(8);
                space.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                space.setVisibility(0);
            }
            b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a.b = imageView.getContext();
            b.C0608b b = a.b(com.sankuai.waimai.foundation.utils.g.a(imageView.getContext(), 62.0f));
            b.f = ImageQualityUtil.b();
            b.c = fVar2.b;
            b.a(imageView);
            textView.setText(fVar2.d);
            textView2.setText(fVar2.e);
        }
    }

    public WmRiderSendPanelAdapter(@Nullable com.sankuai.waimai.business.im.common.plugin.smartreply.d dVar, Map<Integer, i> map, boolean z, boolean z2, int i, com.sankuai.waimai.business.im.callback.a aVar, @NonNull List<RiderImInfo.a> list, boolean z3, long j) {
        super(dVar, i, map);
        Object[] objArr = {dVar, map, (byte) 0, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i), aVar, list, Byte.valueOf(z3 ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d43df285f770eecacdf175e681945b1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d43df285f770eecacdf175e681945b1d");
            return;
        }
        this.g = new Handler(Looper.getMainLooper());
        this.j = false;
        this.q = getClass().getSimpleName();
        this.o = false;
        this.p = z2;
        this.s = list;
        this.v = aVar;
        this.j = z3;
        this.h = j;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2af4abd7f820f7e22423c939110c8a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2af4abd7f820f7e22423c939110c8a0");
        }
        View createView = super.createView(context, viewGroup);
        this.k = context;
        this.m = createView.findViewById(R.id.xm_sdk_send_panel_top_divider);
        if (this.j) {
            Object[] objArr2 = {createView};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88583e64c69f8290fa33b58fba04271f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88583e64c69f8290fa33b58fba04271f");
            } else {
                this.t = (RecyclerView) createView.findViewById(R.id.guess_what_you_encounter_list);
                this.r = createView.findViewById(R.id.order_container);
                this.r.setVisibility(8);
                this.i = createView.findViewById(R.id.wm_im_auto_answer_edit_address_container);
                this.i.findViewById(R.id.auto_answer_edit_address_exit).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.adapter.WmRiderSendPanelAdapter.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "450e289b4742a1cbde21ad259757c90f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "450e289b4742a1cbde21ad259757c90f");
                        } else {
                            WmRiderSendPanelAdapter.this.d();
                        }
                    }
                });
                this.i.findViewById(R.id.auto_answer_edit_address_edit_button).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.adapter.WmRiderSendPanelAdapter.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b04b80a6dde1c68653cb4044f04fa419", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b04b80a6dde1c68653cb4044f04fa419");
                            return;
                        }
                        WmRiderSendPanelAdapter.this.d();
                        if (WmRiderSendPanelAdapter.this.v != null) {
                            WmRiderSendPanelAdapter.this.v.b();
                        }
                    }
                });
                d();
                c();
                final IMInputEditorPlugin iMInputEditorPlugin = (IMInputEditorPlugin) createView.findViewById(R.id.editor_plugin);
                this.t.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.im.common.adapter.WmRiderSendPanelAdapter.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a4523a1e8805167041befb93c3b31dd7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a4523a1e8805167041befb93c3b31dd7");
                            return;
                        }
                        WmRiderSendPanelAdapter.this.n = iMInputEditorPlugin.getEditText();
                        WmRiderSendPanelAdapter.this.n.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.business.im.common.adapter.WmRiderSendPanelAdapter.3.1
                            public static ChangeQuickRedirect a;

                            @Override // android.text.TextWatcher
                            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                            }

                            @Override // android.text.TextWatcher
                            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                            }

                            @Override // android.text.TextWatcher
                            public final void afterTextChanged(Editable editable) {
                                Object[] objArr4 = {editable};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "03471df5c9b38775a0af6628f9e2a4a9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "03471df5c9b38775a0af6628f9e2a4a9");
                                } else {
                                    WmRiderSendPanelAdapter.this.a(editable.toString(), 1);
                                }
                            }
                        });
                    }
                }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            }
        }
        return createView;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca82bfd869f6171dda761406c225cc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca82bfd869f6171dda761406c225cc1");
            return;
        }
        this.r.setVisibility(com.sankuai.waimai.foundation.utils.b.b(this.s) ? 8 : 0);
        if (!com.sankuai.waimai.foundation.utils.b.b(this.s)) {
            if (this.u == null) {
                this.u = new a(this.v);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.t.getContext());
                linearLayoutManager.setOrientation(0);
                this.t.setLayoutManager(linearLayoutManager);
                this.t.setAdapter(this.u);
            }
            this.u.a(this.s);
        } else if (this.u != null) {
            this.u.a(this.s);
        }
    }

    public final void a(String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d5ef9d1d506c8d5513c3c9fc24bee1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d5ef9d1d506c8d5513c3c9fc24bee1");
        } else if (this.j) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8f771e7df78db66e08c1c509f76fe95", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8f771e7df78db66e08c1c509f76fe95");
            } else {
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.q);
            }
            if (TextUtils.isEmpty(str)) {
                a(true);
            } else {
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).getAutoAnswerTypeList(str, this.o, 2, i, this.h), new b.AbstractC1042b<BaseResponse<g>>() { // from class: com.sankuai.waimai.business.im.common.adapter.WmRiderSendPanelAdapter.4
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr3 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f4b1f28b14e1ed475efb9fd0911a1e8c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f4b1f28b14e1ed475efb9fd0911a1e8c");
                        } else if (baseResponse == null || !baseResponse.isSuccess() || baseResponse.data == 0) {
                            WmRiderSendPanelAdapter.this.a(true);
                        } else {
                            g gVar = (g) baseResponse.data;
                            if (com.sankuai.waimai.imbase.utils.a.a(gVar.a)) {
                                WmRiderSendPanelAdapter.this.a(true);
                            } else if (i != 1) {
                                if (WmRiderSendPanelAdapter.this.v != null) {
                                    WmRiderSendPanelAdapter.this.v.a(gVar.a);
                                }
                            } else {
                                WmRiderSendPanelAdapter.a(WmRiderSendPanelAdapter.this, gVar.a);
                            }
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr3 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d681aae66f022e83bc43420d09984983", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d681aae66f022e83bc43420d09984983");
                        } else {
                            WmRiderSendPanelAdapter.this.a(true);
                        }
                    }
                }, this.q);
            }
        }
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca840c6a0db289f1b359cf8a3f7163e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca840c6a0db289f1b359cf8a3f7163e4");
        } else {
            this.g.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2e5be8032368bdca752ca7946c1c892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2e5be8032368bdca752ca7946c1c892");
        } else if (this.m != null) {
            this.m.setVisibility(z ? 0 : 8);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd21520f0e5a697cad2c0c5b509b5986", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd21520f0e5a697cad2c0c5b509b5986");
            return;
        }
        this.i.setVisibility(8);
        this.r.setVisibility(0);
        com.sankuai.waimai.imbase.configuration.a.a().a((short) 1001, R.style.wm_im_theme);
        a(true);
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public final boolean e() {
        return this.p;
    }
}
