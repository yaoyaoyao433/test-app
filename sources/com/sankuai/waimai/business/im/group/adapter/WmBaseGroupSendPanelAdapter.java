package com.sankuai.waimai.business.im.group.adapter;

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
import com.sankuai.waimai.business.im.callback.a;
import com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter;
import com.sankuai.waimai.business.im.common.plugin.IMInputEditorPlugin;
import com.sankuai.waimai.business.im.common.utils.d;
import com.sankuai.waimai.business.im.group.View.WmGroupChatAtView;
import com.sankuai.waimai.business.im.model.RiderImInfo;
import com.sankuai.waimai.business.im.model.f;
import com.sankuai.waimai.business.im.model.g;
import com.sankuai.waimai.business.im.model.i;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.mach.utils.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.xm.imui.common.entity.AtInfo;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmBaseGroupSendPanelAdapter extends IMSendPanelAdapter implements WmGroupChatAtView.a {
    public static ChangeQuickRedirect f;
    public Handler g;
    private final a h;
    private final long i;
    private String j;
    private List<RiderImInfo.a> k;
    private WmGroupChatAtView m;
    private RecyclerView n;
    private com.sankuai.waimai.business.im.common.adapter.a o;
    private EditText p;
    private View q;
    private boolean r;
    private View s;
    private View t;

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public final int a(Context context) {
        return R.layout.wm_im_group_send_panel_input_bar;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter
    public final boolean a() {
        return true;
    }

    public static /* synthetic */ void a(WmBaseGroupSendPanelAdapter wmBaseGroupSendPanelAdapter, List list) {
        f fVar;
        g.a aVar;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, wmBaseGroupSendPanelAdapter, changeQuickRedirect, false, "915eaca318a45cb3f387de8114ca4210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wmBaseGroupSendPanelAdapter, changeQuickRedirect, false, "915eaca318a45cb3f387de8114ca4210");
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
            if (PatchProxy.isSupport(objArr2, wmBaseGroupSendPanelAdapter, changeQuickRedirect2, false, "9836033436a9b4e7cb5d6bcc6c47cf9a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, wmBaseGroupSendPanelAdapter, changeQuickRedirect2, false, "9836033436a9b4e7cb5d6bcc6c47cf9a");
            } else if (d.a(wmBaseGroupSendPanelAdapter.q.getContext(), "_float_address_") <= 0) {
                d.a(wmBaseGroupSendPanelAdapter.q.getContext(), "_float_address_", 1);
                if (wmBaseGroupSendPanelAdapter.h != null) {
                    wmBaseGroupSendPanelAdapter.h.a();
                }
                wmBaseGroupSendPanelAdapter.q.setVisibility(0);
                wmBaseGroupSendPanelAdapter.t.setVisibility(8);
                com.sankuai.waimai.imbase.configuration.a.a().a((short) 1025, R.style.wm_im_theme_edit_address);
                wmBaseGroupSendPanelAdapter.a(false);
                wmBaseGroupSendPanelAdapter.g.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.im.group.adapter.WmBaseGroupSendPanelAdapter.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d3a1ef0efd0c4d484c8c9e1fa59d46fa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d3a1ef0efd0c4d484c8c9e1fa59d46fa");
                        } else {
                            WmBaseGroupSendPanelAdapter.this.d();
                        }
                    }
                }, MetricsAnrManager.ANR_THRESHOLD);
            }
            ImageView imageView = (ImageView) wmBaseGroupSendPanelAdapter.q.findViewById(R.id.auto_answer_edit_address_icon);
            Space space = (Space) wmBaseGroupSendPanelAdapter.q.findViewById(R.id.auto_answer_edit_address_icon_space);
            TextView textView = (TextView) wmBaseGroupSendPanelAdapter.q.findViewById(R.id.auto_answer_edit_address_content);
            TextView textView2 = (TextView) wmBaseGroupSendPanelAdapter.q.findViewById(R.id.auto_answer_edit_address_edit_name);
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

    public WmBaseGroupSendPanelAdapter(@Nullable com.sankuai.waimai.business.im.common.plugin.smartreply.d dVar, @Nullable i iVar, int i, @NonNull List<RiderImInfo.a> list, boolean z, long j, a aVar) {
        super(dVar, iVar, i);
        Object[] objArr = {dVar, iVar, Integer.valueOf(i), list, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a1faecd96be66bda29470fd37d388f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a1faecd96be66bda29470fd37d388f");
            return;
        }
        this.j = getClass().getSimpleName();
        this.g = new Handler(Looper.getMainLooper());
        this.r = false;
        this.k = list;
        this.h = aVar;
        this.r = z;
        this.i = j;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1667aa4d1e7bf64a759e301f04af0a31", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1667aa4d1e7bf64a759e301f04af0a31");
        }
        View createView = super.createView(context, viewGroup);
        this.s = createView.findViewById(R.id.xm_sdk_send_panel_top_divider);
        this.m = (WmGroupChatAtView) createView.findViewById(R.id.wm_group_im_chat_at_view);
        this.m.setOnAtClickCallback(this);
        this.t = createView.findViewById(R.id.order_container);
        if (this.r) {
            Object[] objArr2 = {createView};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec84348fa34c0ebf0307d5ba03ba3e7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec84348fa34c0ebf0307d5ba03ba3e7a");
            } else {
                this.n = (RecyclerView) createView.findViewById(R.id.guess_what_you_encounter_list);
                this.q = createView.findViewById(R.id.wm_im_auto_answer_edit_address_container);
                this.q.findViewById(R.id.auto_answer_edit_address_exit).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.group.adapter.WmBaseGroupSendPanelAdapter.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "58c34a7c5430e3cdb0b2135d9aaa97cd", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "58c34a7c5430e3cdb0b2135d9aaa97cd");
                        } else {
                            WmBaseGroupSendPanelAdapter.this.d();
                        }
                    }
                });
                this.q.findViewById(R.id.auto_answer_edit_address_edit_button).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.group.adapter.WmBaseGroupSendPanelAdapter.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "303c30fd0b2b93c7c5ca6f04ef0a0ba0", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "303c30fd0b2b93c7c5ca6f04ef0a0ba0");
                            return;
                        }
                        WmBaseGroupSendPanelAdapter.this.d();
                        if (WmBaseGroupSendPanelAdapter.this.h != null) {
                            WmBaseGroupSendPanelAdapter.this.h.b();
                        }
                    }
                });
                d();
                c();
                final IMInputEditorPlugin iMInputEditorPlugin = (IMInputEditorPlugin) createView.findViewById(R.id.editor_plugin);
                this.n.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.im.group.adapter.WmBaseGroupSendPanelAdapter.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3e3ff4ed61dede3e4c0ba9957ab436ed", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3e3ff4ed61dede3e4c0ba9957ab436ed");
                            return;
                        }
                        WmBaseGroupSendPanelAdapter.this.p = iMInputEditorPlugin.getEditText();
                        WmBaseGroupSendPanelAdapter.this.p.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.business.im.group.adapter.WmBaseGroupSendPanelAdapter.3.1
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
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "28ec7d748e6d70d614713ac7d6da79bb", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "28ec7d748e6d70d614713ac7d6da79bb");
                                } else {
                                    WmBaseGroupSendPanelAdapter.this.a(editable.toString(), 1);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63dfd695763524874f5cafe0ea9e2356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63dfd695763524874f5cafe0ea9e2356");
        } else if (!com.sankuai.waimai.foundation.utils.b.b(this.k)) {
            if (this.o == null) {
                this.o = new com.sankuai.waimai.business.im.common.adapter.a(this.h);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.n.getContext());
                linearLayoutManager.setOrientation(0);
                this.n.setLayoutManager(linearLayoutManager);
                this.n.setAdapter(this.o);
            }
            this.o.a(this.k);
        } else if (this.o != null) {
            this.o.a(this.k);
        }
    }

    @Override // com.sankuai.waimai.business.im.group.View.WmGroupChatAtView.a
    public final void a(long[] jArr, String str) {
        Object[] objArr = {jArr, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09b5063c841a6dab67d9634255ef94ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09b5063c841a6dab67d9634255ef94ab");
        } else {
            this.c.a(new AtInfo(jArr, str), true);
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80a5dcd33c934155a11fc2d03b2877e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80a5dcd33c934155a11fc2d03b2877e2");
        } else {
            this.m.setOnAtClickCallback(null);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "696dd959a2eecfa255b14cc18d1c3e0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "696dd959a2eecfa255b14cc18d1c3e0c");
            return;
        }
        this.q.setVisibility(8);
        this.t.setVisibility(0);
        com.sankuai.waimai.imbase.configuration.a.a().a((short) 1025, R.style.wm_im_theme);
        a(true);
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "699b0afcb1fc232d5136b8ed19386d7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "699b0afcb1fc232d5136b8ed19386d7c");
        } else if (this.s != null) {
            this.s.setVisibility(z ? 0 : 8);
        }
    }

    public final void a(String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23216c0d13c1685e842b66c48489b58a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23216c0d13c1685e842b66c48489b58a");
        } else if (this.r) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0aa792ef3e05b7760855eca2383e318d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0aa792ef3e05b7760855eca2383e318d");
            } else {
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.j);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).getAutoAnswerTypeList(str, false, 3, i, this.i), new b.AbstractC1042b<BaseResponse<g>>() { // from class: com.sankuai.waimai.business.im.group.adapter.WmBaseGroupSendPanelAdapter.5
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onError(Throwable th) {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr3 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "21d93a70e318ff2a2167e445b4c448a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "21d93a70e318ff2a2167e445b4c448a2");
                    } else if (baseResponse == null || !baseResponse.isSuccess() || baseResponse.data == 0) {
                    } else {
                        g gVar = (g) baseResponse.data;
                        if (com.sankuai.waimai.imbase.utils.a.a(gVar.a)) {
                            return;
                        }
                        if (i != 1) {
                            if (WmBaseGroupSendPanelAdapter.this.h != null) {
                                WmBaseGroupSendPanelAdapter.this.h.a(gVar.a);
                                return;
                            }
                            return;
                        }
                        WmBaseGroupSendPanelAdapter.a(WmBaseGroupSendPanelAdapter.this, gVar.a);
                    }
                }
            }, this.j);
        }
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10a2ba158007e5d4c8233622f7674db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10a2ba158007e5d4c8233622f7674db");
        } else {
            this.g.removeCallbacksAndMessages(null);
        }
    }
}
