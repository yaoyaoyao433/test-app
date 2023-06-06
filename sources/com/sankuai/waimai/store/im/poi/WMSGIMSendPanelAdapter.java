package com.sankuai.waimai.store.im.poi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter;
import com.sankuai.waimai.business.im.common.plugin.smartreply.d;
import com.sankuai.waimai.business.im.model.PoiImInfo;
import com.sankuai.waimai.business.im.model.i;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.im.base.plugin.ImUserGoodsPlugin;
import com.sankuai.waimai.store.im.poi.contract.b;
import com.sankuai.waimai.store.im.poi.listener.e;
import com.sankuai.waimai.store.im.poi.model.ImRecommendScriptInfo;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
import com.sankuai.xm.imui.common.util.c;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMSGIMSendPanelAdapter extends IMSendPanelAdapter implements b.a, e {
    public static ChangeQuickRedirect f;
    private ImUserGoodsPlugin A;
    private View B;
    private String C;
    private String D;
    protected a g;
    protected ExtraPlugin h;
    private final long i;
    private View j;
    private List<PoiImInfo.a> k;
    private LinearLayout m;
    private com.sankuai.waimai.store.im.poi.adapter.b n;
    private boolean o;
    private RecyclerView p;
    private com.sankuai.waimai.store.im.poi.presenter.b q;
    private String r;
    private String s;
    private String t;
    private String u;
    private int v;
    private Plugin w;
    private ImRecommendScriptInfo x;
    private PoiImInfo y;
    private boolean z;

    public WMSGIMSendPanelAdapter(@Nullable d dVar, long j, String str, a aVar, @NonNull List<PoiImInfo.a> list, String str2, String str3, String str4, int i, PoiImInfo poiImInfo, String str5) {
        super(dVar, (i) null, 0);
        boolean z;
        PoiImInfo.b bVar;
        Object[] objArr = {dVar, new Long(j), str, aVar, list, str2, str3, str4, Integer.valueOf(i), poiImInfo, str5};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e029aabd8c8ae57d80bc61b3c1d32b91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e029aabd8c8ae57d80bc61b3c1d32b91");
            return;
        }
        this.o = false;
        this.r = "SG_WM_CHAT";
        this.v = 0;
        this.z = false;
        this.g = aVar;
        this.k = list;
        this.i = j;
        this.D = str;
        this.s = TextUtils.isEmpty(str2) ? "0" : str2;
        this.t = TextUtils.isEmpty(str3) ? "0" : str3;
        this.u = str4;
        this.v = i;
        this.y = poiImInfo;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ff7c3c889d7ff7671377df5b5b6db4c", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ff7c3c889d7ff7671377df5b5b6db4c")).booleanValue();
        } else {
            z = (this.y == null || com.sankuai.waimai.foundation.utils.b.b(this.y.inputRightConfigs) || (bVar = (PoiImInfo.b) com.sankuai.waimai.foundation.utils.b.a(this.y.inputRightConfigs, 0)) == null || bVar.d != 1) ? false : true;
        }
        this.z = z;
        this.C = str5;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x031a  */
    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View createView(android.content.Context r27, android.view.ViewGroup r28) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.im.poi.WMSGIMSendPanelAdapter.createView(android.content.Context, android.view.ViewGroup):android.view.View");
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public boolean onPluginEvent(Plugin plugin, int i, Object obj) {
        Object[] objArr = {plugin, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df243e29ef10781f518421c6320d992e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df243e29ef10781f518421c6320d992e")).booleanValue();
        }
        if (plugin != null && this.c == plugin && this.v != 3) {
            if (this.c.getEditText() != null && !this.o) {
                this.o = true;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = f;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05bc41e45ee1b3a8059a5c3946b95a90", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05bc41e45ee1b3a8059a5c3946b95a90");
                } else if (this.v != 3) {
                    this.c.getEditText().addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.store.im.poi.WMSGIMSendPanelAdapter.3
                        public static ChangeQuickRedirect a;

                        @Override // android.text.TextWatcher
                        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        }

                        @Override // android.text.TextWatcher
                        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        }

                        @Override // android.text.TextWatcher
                        public final void afterTextChanged(Editable editable) {
                            Object[] objArr3 = {editable};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "457ce6b338e80a90b348895d30d6665b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "457ce6b338e80a90b348895d30d6665b");
                            } else if (WMSGIMSendPanelAdapter.this.v == 3 || WMSGIMSendPanelAdapter.this.y == null || WMSGIMSendPanelAdapter.this.y.getPoiImStatus() != 0) {
                            } else {
                                if (editable == null || TextUtils.isEmpty(editable.toString()) || editable.toString().length() > 30 || WMSGIMSendPanelAdapter.this.q == null) {
                                    if (WMSGIMSendPanelAdapter.this.n != null) {
                                        WMSGIMSendPanelAdapter.this.n.a(null);
                                        return;
                                    }
                                    return;
                                }
                                long currentTimeMillis = System.currentTimeMillis();
                                final com.sankuai.waimai.store.im.poi.presenter.b bVar = WMSGIMSendPanelAdapter.this.q;
                                String valueOf = String.valueOf(WMSGIMSendPanelAdapter.this.i);
                                String str = WMSGIMSendPanelAdapter.this.D;
                                String str2 = WMSGIMSendPanelAdapter.this.t;
                                String valueOf2 = String.valueOf(currentTimeMillis);
                                String str3 = WMSGIMSendPanelAdapter.this.u;
                                String str4 = WMSGIMSendPanelAdapter.this.s;
                                String obj2 = editable.toString();
                                Object[] objArr4 = {valueOf, str, str2, valueOf2, str3, str4, obj2};
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.im.poi.presenter.b.a;
                                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "cac3c733b3c3112cdc3d8bd202179635", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "cac3c733b3c3112cdc3d8bd202179635");
                                } else {
                                    com.sankuai.waimai.store.im.base.net.b.a(bVar.c).a(valueOf, str, str2, valueOf2, str3, str4, obj2, new j<ImRecommendScriptInfo>() { // from class: com.sankuai.waimai.store.im.poi.presenter.b.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.store.base.net.j
                                        public final void a() {
                                            Object[] objArr5 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "93e5cfc8df647b88b9ba92fcd1a32c3f", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "93e5cfc8df647b88b9ba92fcd1a32c3f");
                                            }
                                        }

                                        @Override // com.sankuai.waimai.store.base.net.j
                                        public final void a(com.sankuai.waimai.store.repository.net.b bVar2) {
                                        }

                                        @Override // com.sankuai.waimai.store.base.net.j
                                        public final void b() {
                                        }

                                        @Override // com.sankuai.waimai.store.base.net.j
                                        public final /* synthetic */ void a(ImRecommendScriptInfo imRecommendScriptInfo) {
                                            ImRecommendScriptInfo imRecommendScriptInfo2 = imRecommendScriptInfo;
                                            Object[] objArr5 = {imRecommendScriptInfo2};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1a6cb23026e7726ae6308c56be098dee", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1a6cb23026e7726ae6308c56be098dee");
                                            } else if (imRecommendScriptInfo2 == null || bVar.b == null) {
                                            } else {
                                                bVar.b.a(imRecommendScriptInfo2);
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    });
                }
            }
            if (i == 131072 && this.n != null) {
                this.n.a(null);
            }
        }
        if (plugin != null && this.w != null && this.w == plugin && this.v != 3 && i == 196608 && this.c != null && this.c.getEditText() != null && this.x != null && !TextUtils.isEmpty(this.x.content)) {
            String obj2 = this.c.getEditText().getText().toString();
            if (!TextUtils.isEmpty(obj2) && TextUtils.equals(obj2, this.x.content)) {
                a(this.x.recommendStatementLists, null, obj2, TextUtils.isEmpty(this.x.recomStatementBizId) ? "-999" : this.x.recomStatementBizId, "b_waimai_eqrkmzly_mc");
            }
        }
        if (this.z && this.d != null && this.d == plugin && this.B != null) {
            if (i == 65536) {
                u.c(this.B);
            } else if (i == 131072) {
                u.a(this.B);
            }
        }
        return super.onPluginEvent(plugin, i, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90a5979b0c6b0d368002a77645d745e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90a5979b0c6b0d368002a77645d745e1");
        } else if (i != 10 || TextUtils.isEmpty(this.C)) {
        } else {
            if (z) {
                com.sankuai.waimai.store.manager.judas.b.a(com.sankuai.waimai.business.im.utils.d.a, TextUtils.equals(this.C, "14090") ? "b_waimai_zrno5v9m_mc" : "b_waimai_xkocu2m6_mc").a("poi_id", Long.valueOf(this.i)).a();
            } else if (TextUtils.equals(this.C, "14090")) {
                JudasManualManager.b("b_waimai_zrno5v9m_mv").a(com.sankuai.waimai.business.im.utils.d.a).a("poi_id", this.i).a();
            }
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public void onInputStateChange(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6741b160f33309ce733e6eda1542b16a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6741b160f33309ce733e6eda1542b16a");
        } else {
            super.onInputStateChange(i, obj);
        }
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public final int a(Context context) {
        return this.z ? R.layout.wm_sc_common_im_send_panel_input_bar_new : R.layout.wm_sc_common_im_send_panel_input_bar;
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.b.a
    public final void a(ImRecommendScriptInfo imRecommendScriptInfo) {
        Object[] objArr = {imRecommendScriptInfo};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e103df4f2922759d455a3e9be865b56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e103df4f2922759d455a3e9be865b56");
        } else if (this.n == null) {
        } else {
            this.n.a(null);
            this.x = imRecommendScriptInfo;
            if (this.c == null || this.c.getEditText() == null || imRecommendScriptInfo == null || TextUtils.isEmpty(imRecommendScriptInfo.content) || !TextUtils.equals(imRecommendScriptInfo.content, this.c.getEditText().getText().toString()) || com.sankuai.waimai.foundation.utils.b.b(imRecommendScriptInfo.recommendStatementLists)) {
                return;
            }
            this.n.e = imRecommendScriptInfo.content;
            this.n.d = TextUtils.isEmpty(imRecommendScriptInfo.recomStatementBizId) ? "-999" : imRecommendScriptInfo.recomStatementBizId;
            List<ImRecommendScriptInfo.RecommendStatementList> list = imRecommendScriptInfo.recommendStatementLists;
            String str = imRecommendScriptInfo.content;
            String str2 = imRecommendScriptInfo.recomStatementBizId;
            Object[] objArr2 = {list, str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41aa87bd12ffb3308dc273f4acf2773a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41aa87bd12ffb3308dc273f4acf2773a");
            } else if (this.v != 3) {
                com.sankuai.waimai.store.manager.judas.b.b(com.sankuai.waimai.business.im.utils.d.a, "b_waimai_1t2nxeey_mv").a("query_id", str2).a("text", str).a("statement_id", a(list)).a("ta_statement_id", "-999").a("poi_id", Long.valueOf(this.i)).a();
            }
            this.n.a(imRecommendScriptInfo.recommendStatementLists);
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.listener.e
    public final void a(List<ImRecommendScriptInfo.RecommendStatementList> list, ImRecommendScriptInfo.RecommendStatementList recommendStatementList, String str, String str2) {
        Object[] objArr = {list, recommendStatementList, str, str2};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29af7023d5e9df757b1efbd3a50cf333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29af7023d5e9df757b1efbd3a50cf333");
            return;
        }
        a(list, recommendStatementList, str, str2, "b_waimai_1t2nxeey_mc");
        if (this.n != null) {
            this.n.a(null);
        }
        if (recommendStatementList != null && !TextUtils.isEmpty(recommendStatementList.statement)) {
            HashMap hashMap = new HashMap();
            hashMap.put("recom_statement_id", TextUtils.isEmpty(recommendStatementList.recomStatementId) ? "-999" : recommendStatementList.recomStatementId);
            if (TextUtils.isEmpty(str2)) {
                str2 = "-999";
            }
            hashMap.put("recom_statement_biz_id", str2);
            TextMessage a = c.a(recommendStatementList.statement);
            a.appendExtension(hashMap);
            IMUIManager.a().a((IMMessage) a, false);
        }
        if (this.c == null || this.c.getEditText() == null) {
            return;
        }
        this.c.getEditText().setText("");
    }

    private void a(List<ImRecommendScriptInfo.RecommendStatementList> list, ImRecommendScriptInfo.RecommendStatementList recommendStatementList, String str, String str2, String str3) {
        Object[] objArr = {list, recommendStatementList, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c233ee30253e69348304369ceaa4c4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c233ee30253e69348304369ceaa4c4b");
        } else if (this.v == 3) {
        } else {
            String a = a(list);
            String str4 = "-999";
            if (recommendStatementList != null && !TextUtils.isEmpty(recommendStatementList.recomStatementId)) {
                str4 = recommendStatementList.recomStatementId;
            }
            com.sankuai.waimai.store.manager.judas.b.a(com.sankuai.waimai.business.im.utils.d.a, str3).a("query_id", str2).a("text", TextUtils.isEmpty(str) ? "-999" : str).a("statement_id", a).a("ta_statement_id", str4).a("poi_id", Long.valueOf(this.i)).a();
        }
    }

    private String a(List<ImRecommendScriptInfo.RecommendStatementList> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f0f05b0fd516234895f4a98fd0f8a2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f0f05b0fd516234895f4a98fd0f8a2c");
        }
        StringBuilder sb = new StringBuilder();
        if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            return "-999";
        }
        for (int i = 0; i < list.size(); i++) {
            ImRecommendScriptInfo.RecommendStatementList recommendStatementList = list.get(i);
            if (recommendStatementList != null) {
                sb.append(recommendStatementList.recomStatementId);
                if (i != com.sankuai.waimai.foundation.utils.b.c(list) - 1) {
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
        }
        return sb.toString();
    }
}
