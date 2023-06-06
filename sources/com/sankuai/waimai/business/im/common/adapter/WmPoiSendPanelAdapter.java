package com.sankuai.waimai.business.im.common.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.im.api.WaimaiIMService;
import com.sankuai.waimai.business.im.common.plugin.IMInputEditorPlugin;
import com.sankuai.waimai.business.im.common.plugin.smartreply.d;
import com.sankuai.waimai.business.im.model.PoiImInfo;
import com.sankuai.waimai.business.im.model.g;
import com.sankuai.waimai.business.im.model.i;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.widget.ObservableHorizontalScrollView;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmPoiSendPanelAdapter extends IMSendPanelAdapter {
    public static ChangeQuickRedirect f;
    final long g;
    boolean h;
    String i;
    private a j;
    private Context k;
    private ObservableHorizontalScrollView m;
    private View n;
    private LinearLayout o;
    private View p;
    private EditText q;
    private boolean r;
    private View s;
    private List<PoiImInfo.a> t;
    private RecyclerView u;
    private b v;
    private c w;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(g.a aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        void a(PoiImInfo.a aVar);

        void b(PoiImInfo.a aVar);
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public final int a(Context context) {
        return R.layout.wm_im_poi_send_panel_input_bar;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter
    public final boolean a() {
        return true;
    }

    public static /* synthetic */ void a(WmPoiSendPanelAdapter wmPoiSendPanelAdapter, List list) {
        TextView textView;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, wmPoiSendPanelAdapter, changeQuickRedirect, false, "ef3e1fa0bdf7b4156cc67dbd4c78bc98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wmPoiSendPanelAdapter, changeQuickRedirect, false, "ef3e1fa0bdf7b4156cc67dbd4c78bc98");
            return;
        }
        wmPoiSendPanelAdapter.o.removeAllViews();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            final g.a aVar = (g.a) it.next();
            if (aVar != null && aVar.b != 3) {
                Object[] objArr2 = {Integer.valueOf(i), aVar};
                ChangeQuickRedirect changeQuickRedirect2 = f;
                if (PatchProxy.isSupport(objArr2, wmPoiSendPanelAdapter, changeQuickRedirect2, false, "e84950b6482022127bcca6f9c07febb3", RobustBitConfig.DEFAULT_VALUE)) {
                    textView = (View) PatchProxy.accessDispatch(objArr2, wmPoiSendPanelAdapter, changeQuickRedirect2, false, "e84950b6482022127bcca6f9c07febb3");
                } else {
                    TextView textView2 = new TextView(wmPoiSendPanelAdapter.k);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, com.sankuai.waimai.foundation.utils.g.a(wmPoiSendPanelAdapter.k, 40.0f));
                    if (i > 0) {
                        marginLayoutParams.leftMargin = com.sankuai.waimai.foundation.utils.g.a(wmPoiSendPanelAdapter.k, 13.0f);
                    }
                    textView2.setLayoutParams(marginLayoutParams);
                    textView2.setBackgroundResource(R.drawable.wm_im_auto_answer_bg_white_with_corner);
                    textView2.setGravity(16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
                    int a2 = com.sankuai.waimai.foundation.utils.g.a(wmPoiSendPanelAdapter.k, 12.0f);
                    textView2.setPadding(a2, 0, a2, 0);
                    textView2.setTextColor(Color.parseColor("#333333"));
                    textView2.setTextSize(14.0f);
                    textView2.setText(aVar.c);
                    textView2.setCompoundDrawablePadding(com.sankuai.waimai.foundation.utils.g.a(wmPoiSendPanelAdapter.k, 3.0f));
                    if (aVar.b == 1) {
                        textView2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.wm_im_auto_answer_address, 0, R.drawable.wm_im_auto_answer_right_arrow, 0);
                        textView = textView2;
                    } else {
                        textView2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.wm_im_auto_answer_biz_hours, 0, R.drawable.wm_im_auto_answer_right_arrow, 0);
                        textView = textView2;
                    }
                }
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.adapter.WmPoiSendPanelAdapter.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "98cdf7dcc44bd8aed18589d2be29c478", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "98cdf7dcc44bd8aed18589d2be29c478");
                            return;
                        }
                        WmPoiSendPanelAdapter.d(WmPoiSendPanelAdapter.this);
                        if (WmPoiSendPanelAdapter.this.j != null) {
                            WmPoiSendPanelAdapter.this.j.a(aVar);
                        }
                    }
                });
                textView.setTag(aVar);
                wmPoiSendPanelAdapter.o.addView(textView);
                i++;
                if (i >= 5) {
                    break;
                }
            }
        }
        if (wmPoiSendPanelAdapter.o.getChildCount() > 0) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = f;
            if (PatchProxy.isSupport(objArr3, wmPoiSendPanelAdapter, changeQuickRedirect3, false, "939e36191adb24c34bbe9e4a6b5bdb7d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, wmPoiSendPanelAdapter, changeQuickRedirect3, false, "939e36191adb24c34bbe9e4a6b5bdb7d");
            } else {
                wmPoiSendPanelAdapter.n.setVisibility(0);
                if (wmPoiSendPanelAdapter.p != null) {
                    wmPoiSendPanelAdapter.p.setVisibility(8);
                }
            }
            wmPoiSendPanelAdapter.f();
            return;
        }
        wmPoiSendPanelAdapter.d();
    }

    public static /* synthetic */ void d(WmPoiSendPanelAdapter wmPoiSendPanelAdapter) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, wmPoiSendPanelAdapter, changeQuickRedirect, false, "4bbb45d9165150ca9d671ac46317543d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wmPoiSendPanelAdapter, changeQuickRedirect, false, "4bbb45d9165150ca9d671ac46317543d");
            return;
        }
        wmPoiSendPanelAdapter.q.setText("");
        wmPoiSendPanelAdapter.d();
    }

    public WmPoiSendPanelAdapter(@Nullable d dVar, a aVar, boolean z, boolean z2, int i, c cVar, @NonNull List<PoiImInfo.a> list, long j) {
        super(dVar, (i) null, i);
        Object[] objArr = {dVar, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i), cVar, list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9778bd3b8537c36ecb889ba2834b6d1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9778bd3b8537c36ecb889ba2834b6d1e");
            return;
        }
        this.i = getClass().getSimpleName();
        this.j = aVar;
        this.h = z;
        this.r = z2;
        this.t = list;
        this.w = cVar;
        this.g = j;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1303a24b641ef649c7b7a35edfde6f03", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1303a24b641ef649c7b7a35edfde6f03");
        }
        View createView = super.createView(context, viewGroup);
        this.k = context;
        this.m = (ObservableHorizontalScrollView) createView.findViewById(R.id.poi_send_panel_bar_auto_answer_layout);
        this.o = (LinearLayout) createView.findViewById(R.id.auto_answer_type_container);
        this.n = createView.findViewById(R.id.auto_answer_type_outer_container);
        this.u = (RecyclerView) createView.findViewById(R.id.guess_what_you_encounter_list);
        this.s = createView.findViewById(R.id.order_container);
        this.s.setVisibility(8);
        this.p = createView.findViewById(R.id.xm_sdk_send_panel_top_divider);
        d();
        if (!com.sankuai.waimai.foundation.utils.b.b(this.t)) {
            this.s.setVisibility(0);
            this.v = new b();
            b bVar = this.v;
            List<PoiImInfo.a> list = this.t;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "bad97bf5d548e8fca6369beb8d34707f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "bad97bf5d548e8fca6369beb8d34707f");
            } else {
                bVar.b = list;
                bVar.notifyDataSetChanged();
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.k);
            linearLayoutManager.setOrientation(0);
            this.u.setLayoutManager(linearLayoutManager);
            this.u.setAdapter(this.v);
        }
        this.m.setOnScrollListener(new ObservableHorizontalScrollView.a() { // from class: com.sankuai.waimai.business.im.common.adapter.WmPoiSendPanelAdapter.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.ObservableHorizontalScrollView.a
            public final void a(ObservableHorizontalScrollView observableHorizontalScrollView, boolean z, int i, int i2, int i3, int i4) {
                Object[] objArr3 = {observableHorizontalScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be1e1e912c14f8cf32d568b823cc2662", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be1e1e912c14f8cf32d568b823cc2662");
                } else {
                    WmPoiSendPanelAdapter.this.f();
                }
            }
        });
        final IMInputEditorPlugin iMInputEditorPlugin = (IMInputEditorPlugin) createView.findViewById(R.id.editor_plugin);
        this.m.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.im.common.adapter.WmPoiSendPanelAdapter.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2da5f74214d6bad3ae298c9df6d628f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2da5f74214d6bad3ae298c9df6d628f0");
                    return;
                }
                WmPoiSendPanelAdapter.this.q = iMInputEditorPlugin.getEditText();
                WmPoiSendPanelAdapter.this.q.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.business.im.common.adapter.WmPoiSendPanelAdapter.2.1
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
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6981a44edf991f5e3d837189b0af5896", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6981a44edf991f5e3d837189b0af5896");
                            return;
                        }
                        final WmPoiSendPanelAdapter wmPoiSendPanelAdapter = WmPoiSendPanelAdapter.this;
                        String obj = editable.toString();
                        Object[] objArr5 = {obj, 1};
                        ChangeQuickRedirect changeQuickRedirect5 = WmPoiSendPanelAdapter.f;
                        if (PatchProxy.isSupport(objArr5, wmPoiSendPanelAdapter, changeQuickRedirect5, false, "8524ba919620e985a12bdb45c5942e6e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, wmPoiSendPanelAdapter, changeQuickRedirect5, false, "8524ba919620e985a12bdb45c5942e6e");
                            return;
                        }
                        wmPoiSendPanelAdapter.c();
                        if (TextUtils.isEmpty(obj)) {
                            wmPoiSendPanelAdapter.d();
                        } else {
                            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).getAutoAnswerTypeList(obj, wmPoiSendPanelAdapter.h, 1, 1, wmPoiSendPanelAdapter.g), new b.AbstractC1042b<BaseResponse<g>>() { // from class: com.sankuai.waimai.business.im.common.adapter.WmPoiSendPanelAdapter.3
                                public static ChangeQuickRedirect a;

                                @Override // rx.e
                                public final /* synthetic */ void onNext(Object obj2) {
                                    BaseResponse baseResponse = (BaseResponse) obj2;
                                    Object[] objArr6 = {baseResponse};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e1a06e4264416eee3db7eef62b81110d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e1a06e4264416eee3db7eef62b81110d");
                                    } else if (baseResponse == null || !baseResponse.isSuccess() || baseResponse.data == 0) {
                                        WmPoiSendPanelAdapter.this.d();
                                    } else {
                                        g gVar = (g) baseResponse.data;
                                        if (com.sankuai.waimai.imbase.utils.a.a(gVar.a)) {
                                            WmPoiSendPanelAdapter.this.d();
                                        } else {
                                            WmPoiSendPanelAdapter.a(WmPoiSendPanelAdapter.this, gVar.a);
                                        }
                                    }
                                }

                                @Override // rx.e
                                public final void onError(Throwable th) {
                                    Object[] objArr6 = {th};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7238c884430716d747572db077d2cda7", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7238c884430716d747572db077d2cda7");
                                    } else {
                                        WmPoiSendPanelAdapter.this.d();
                                    }
                                }
                            }, wmPoiSendPanelAdapter.i);
                        }
                    }
                });
            }
        }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        return createView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5ddaa84c53e7cabc3a94ec0076134a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5ddaa84c53e7cabc3a94ec0076134a");
            return;
        }
        for (int i = 0; i < this.o.getChildCount(); i++) {
            View childAt = this.o.getChildAt(i);
            if (childAt != null && (childAt.getTag() instanceof g.a)) {
                g.a aVar = (g.a) childAt.getTag();
                if (!aVar.e && ah.b(childAt)) {
                    aVar.e = true;
                    JudasManualManager.b("b_waimai_gvjyeep4_mv").a("c_waimai_wgiu7lrd").a("keyword", aVar.b).a();
                }
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f7bdb6b4ab15e277e4ff839b2f280b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f7bdb6b4ab15e277e4ff839b2f280b9");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6edfa00e4de3f487b4b6b8fe4c67db9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6edfa00e4de3f487b4b6b8fe4c67db9");
            return;
        }
        this.n.setVisibility(8);
        if (this.p != null) {
            this.p.setVisibility(0);
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public final boolean e() {
        return this.r;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b extends RecyclerView.a<a> {
        public static ChangeQuickRedirect a;
        List<PoiImInfo.a> b;

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(@NonNull a aVar, int i) {
            final a aVar2 = aVar;
            Object[] objArr = {aVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c79edf4f01620591575e1886bf0acb14", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c79edf4f01620591575e1886bf0acb14");
                return;
            }
            final PoiImInfo.a aVar3 = (PoiImInfo.a) com.sankuai.waimai.foundation.utils.b.a(this.b, i);
            Object[] objArr2 = {aVar3};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "9ad3f423b3cee16769d176b0232fa007", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "9ad3f423b3cee16769d176b0232fa007");
                return;
            }
            WmPoiSendPanelAdapter.this.w.a(aVar3);
            if (!TextUtils.isEmpty(aVar3.e)) {
                aVar2.c.setVisibility(0);
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = aVar2.c.getContext();
                a2.c = aVar3.e;
                a2.e = 1;
                a2.f = ImageQualityUtil.b();
                a2.a(aVar2.c);
            } else {
                aVar2.c.setVisibility(8);
            }
            aVar2.d.setText(aVar3.b);
            aVar2.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.adapter.WmPoiSendPanelAdapter.b.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "df350090be5c0134761427572a7c4c9c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "df350090be5c0134761427572a7c4c9c");
                    } else {
                        WmPoiSendPanelAdapter.this.w.b(aVar3);
                    }
                }
            });
        }

        @Override // android.support.v7.widget.RecyclerView.a
        @NonNull
        public final /* synthetic */ a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad55244233e601606e0bf935eef4df1", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad55244233e601606e0bf935eef4df1") : new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_im_layout_problem_tag_item, viewGroup, false));
        }

        public b() {
            Object[] objArr = {WmPoiSendPanelAdapter.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6ead48c6b2300c1e79657ac8bbe00fe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6ead48c6b2300c1e79657ac8bbe00fe");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b699216bc2cf0a9969fc9083e79b2518", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b699216bc2cf0a9969fc9083e79b2518")).intValue() : this.b.size();
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public class a extends RecyclerView.s {
            public static ChangeQuickRedirect a;
            View b;
            public ImageView c;
            public TextView d;

            public a(View view) {
                super(view);
                Object[] objArr = {b.this, view};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d0e6b7c85e9d420f9dcc45f6309ef5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d0e6b7c85e9d420f9dcc45f6309ef5");
                    return;
                }
                this.b = view.findViewById(R.id.tv_problem_tag_lly);
                this.c = (ImageView) view.findViewById(R.id.tv_problem_tag_icon);
                this.d = (TextView) view.findViewById(R.id.tv_problem_tag);
            }
        }
    }
}
