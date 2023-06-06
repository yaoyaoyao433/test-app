package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.q;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.OrderStatusButtonListInfo;
import com.sankuai.waimai.bussiness.order.detailnew.util.d;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.tencent.liteav.TXLiteAVCode;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b extends BaseAdapter {
    public static ChangeQuickRedirect a;
    protected Context b;
    public List<ButtonItem> c;
    protected OrderStatusButtonListInfo d;
    protected ViewGroup e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private int j;
    private int k;

    public abstract View b(Context context, ButtonItem buttonItem, View view, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "793a3f9fdf7597df730ea3edaba3d979", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "793a3f9fdf7597df730ea3edaba3d979");
        } else {
            this.b = context;
        }
    }

    public void a(List<ButtonItem> list, OrderStatusButtonListInfo orderStatusButtonListInfo, String str, String str2, String str3, boolean z, int i, int i2, ViewGroup viewGroup) {
        Object[] objArr = {list, orderStatusButtonListInfo, str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6a0434ba1738d78430043e0ebabf1a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6a0434ba1738d78430043e0ebabf1a3");
            return;
        }
        this.c = list;
        this.d = orderStatusButtonListInfo;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = z;
        this.j = i;
        this.k = i2;
        this.e = viewGroup;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0abfca63eecdfc1bb6fe93fd0707c3f8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0abfca63eecdfc1bb6fe93fd0707c3f8") : a(this.b, this.c.get(i), view, viewGroup);
    }

    public final View a(Context context, ButtonItem buttonItem, View view, ViewGroup viewGroup) {
        q qVar;
        Object[] objArr = {context, buttonItem, view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81f1781a34b7b3ed9e793ef078672534", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81f1781a34b7b3ed9e793ef078672534");
        }
        if (buttonItem == null) {
            return null;
        }
        int i = buttonItem.code;
        switch (i) {
            case 2001:
                View b = b(context, buttonItem, view, viewGroup);
                JudasManualManager.b("b_HPYip").a("c_hgowsqb").a(this.b).a();
                return b;
            case 2002:
                View b2 = b(context, buttonItem, view, viewGroup);
                a("b_FVF34", this.f);
                return b2;
            case 2003:
                View b3 = b(context, buttonItem, view, viewGroup);
                a("b_Xx5dt", this.f);
                return b3;
            case 2004:
                View b4 = b(context, buttonItem, view, viewGroup);
                JudasManualManager.b("b_iv9jJ").a("order_id", this.f).a("reminder_status", this.i ? 2 : 1).a("c_hgowsqb").a(this.b).a();
                return b4;
            case 2005:
                View b5 = b(context, buttonItem, view, viewGroup);
                a("b_bovWf", this.f);
                return b5;
            case 2006:
                View b6 = b(context, buttonItem, view, viewGroup);
                a("b_QIO48", this.f);
                return b6;
            case 2007:
                View b7 = b(context, buttonItem, view, viewGroup);
                a("b_a9to5", this.f);
                return b7;
            case 2008:
                View b8 = b(context, buttonItem, view, viewGroup);
                a("b_rQCrn", this.f);
                return b8;
            case 2009:
                return b(context, buttonItem, view, viewGroup);
            case 2010:
                View b9 = b(context, buttonItem, view, viewGroup);
                a("b_Gkeky", this.f);
                return b9;
            default:
                switch (i) {
                    case 2012:
                        View b10 = b(context, buttonItem, view, viewGroup);
                        a("b_yCHHZ", this.f, this.d.logicInfo.c, this.d.logicInfo.d);
                        return b10;
                    case 2013:
                        View b11 = b(context, buttonItem, view, viewGroup);
                        JudasManualManager.b("b_d2k8m").a("c_hgowsqb").a(this.b).a();
                        return b11;
                    case 2014:
                        View b12 = b(context, buttonItem, view, viewGroup);
                        JudasManualManager.b("b_RtFUO").a("c_hgowsqb").a(this.b).a();
                        return b12;
                    case 2015:
                        return b(context, buttonItem, view, viewGroup);
                    case 2016:
                        View b13 = b(context, buttonItem, view, viewGroup);
                        JudasManualManager.b("b_DMvNh").a("c_hgowsqb").a(this.b).a();
                        return b13;
                    default:
                        switch (i) {
                            case TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE /* 2019 */:
                                View b14 = b(context, buttonItem, view, viewGroup);
                                a("b_bwp9e1l3", this.f);
                                return b14;
                            case 2020:
                                View b15 = b(context, buttonItem, view, viewGroup);
                                JudasManualManager.a a2 = JudasManualManager.b("b_32wn5bt6").a("c_hgowsqb");
                                StringBuilder sb = new StringBuilder();
                                sb.append(this.j);
                                JudasManualManager.a a3 = a2.a("actual_delivery_type", sb.toString());
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.k);
                                a3.a(DataConstants.CITY_ID, sb2.toString()).a("complain_status", "2020").a("complain_position", 0).a(this.b).a();
                                return b15;
                            case 2021:
                                View b16 = b(context, buttonItem, view, viewGroup);
                                JudasManualManager.a a4 = JudasManualManager.b("b_32wn5bt6").a("c_hgowsqb");
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.j);
                                JudasManualManager.a a5 = a4.a("actual_delivery_type", sb3.toString());
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(this.k);
                                a5.a(DataConstants.CITY_ID, sb4.toString()).a("complain_status", "2021").a("complain_position", 0).a(this.b).a();
                                return b16;
                            default:
                                switch (i) {
                                    case TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_LOADING /* 2023 */:
                                        return b(context, buttonItem, view, viewGroup);
                                    case TXLiteAVCode.EVT_AUDIO_JITTER_STATE_LOADING /* 2024 */:
                                        View b17 = b(context, buttonItem, view, viewGroup);
                                        a("b_waimai_m9u64f13_mv", this.f);
                                        return b17;
                                    case TXLiteAVCode.EVT_AUDIO_JITTER_STATE_PLAYING /* 2025 */:
                                        View b18 = b(context, buttonItem, view, viewGroup);
                                        a("b_waimai_j4s8z4iy_mv", this.f);
                                        return b18;
                                    case TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_PLAY /* 2026 */:
                                        View b19 = b(context, buttonItem, view, viewGroup);
                                        a("b_waimai_m2vral4j_mv", this.f);
                                        return b19;
                                    case TXLiteAVCode.EVT_MIC_START_SUCC /* 2027 */:
                                        View b20 = b(context, buttonItem, view, viewGroup);
                                        a("b_Xx5dt", this.f);
                                        return b20;
                                    default:
                                        switch (i) {
                                            case 2040:
                                                return b(context, buttonItem, view, viewGroup);
                                            case 2041:
                                                View b21 = b(context, buttonItem, view, viewGroup);
                                                JudasManualManager.b("b_hhiowkga").a("c_hgowsqb").a(this.b).a();
                                                return b21;
                                            case 2042:
                                                View b22 = b(context, buttonItem, view, viewGroup);
                                                JudasManualManager.b("b_waimai_grg5sxlc_mv").a("c_hgowsqb").a("poi_id", i.a(this.g, this.h)).a(this.b).a();
                                                return b22;
                                            default:
                                                switch (i) {
                                                    case 2052:
                                                        View b23 = b(context, buttonItem, view, viewGroup);
                                                        com.sankuai.waimai.bussiness.order.detailnew.im.a.a(0, this.b);
                                                        return b23;
                                                    case 2053:
                                                        return b(context, buttonItem, view, viewGroup);
                                                    default:
                                                        switch (i) {
                                                            case 3111:
                                                                return b(context, buttonItem, view, viewGroup);
                                                            case 3112:
                                                                View b24 = b(context, buttonItem, view, viewGroup);
                                                                String str = "-999";
                                                                if (this.d != null && !aa.a(this.d.trackingInfo) && (qVar = (q) d.a().fromJson(this.d.trackingInfo, (Class<Object>) q.class)) != null && !aa.a(qVar.a)) {
                                                                    str = qVar.a;
                                                                }
                                                                JudasManualManager.b("b_waimai_88scjqid_mv").a("c_hgowsqb").a("poi_id", i.a(this.g, this.h)).a("stid", str).a(this.b).a();
                                                                return b24;
                                                            default:
                                                                switch (i) {
                                                                    case 1001:
                                                                        View b25 = b(context, buttonItem, view, viewGroup);
                                                                        JudasManualManager.b("b_NcR0g").a("order_id", this.f).a("c_hgowsqb").a(this.b).a();
                                                                        return b25;
                                                                    case TXLiteAVCode.EVT_AUDIO_DEVICE_ROUTE_CHANGED /* 2030 */:
                                                                        return b(context, buttonItem, view, viewGroup);
                                                                    case 2045:
                                                                        View b26 = b(context, buttonItem, view, viewGroup);
                                                                        a("b_FVF34", this.f);
                                                                        return b26;
                                                                    case 2048:
                                                                        return b(context, buttonItem, view, viewGroup);
                                                                    case 2050:
                                                                        View b27 = b(context, buttonItem, view, viewGroup);
                                                                        JudasManualManager.b("b_waimai_snhfvikt_mv").a("page_type", -999).a("poi_id", i.a(this.g, this.h)).a("button_name", buttonItem.title).a("status_code", buttonItem.code).a("c_hgowsqb").a(this.b).a();
                                                                        return b27;
                                                                    case 2060:
                                                                        View b28 = b(context, buttonItem, view, viewGroup);
                                                                        JudasManualManager.b("b_waimai_sg_sik2emu9_mv").a("c_hgowsqb").a("poi_id", i.a(this.g, this.h)).a("order_id", this.f).a(this.b).a();
                                                                        return b28;
                                                                    case 2070:
                                                                        return b(context, buttonItem, view, viewGroup);
                                                                    case 3001:
                                                                        return b(context, buttonItem, view, viewGroup);
                                                                    case 3132:
                                                                        return b(context, buttonItem, view, viewGroup);
                                                                    case 5001:
                                                                        return b(context, buttonItem, view, viewGroup);
                                                                    case Integer.MAX_VALUE:
                                                                        return b(context, buttonItem, view, viewGroup);
                                                                    default:
                                                                        return null;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5573fcc79dbb2507c858e40fc32ab1ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5573fcc79dbb2507c858e40fc32ab1ad");
        } else {
            a(str, str2, -1L, "");
        }
    }

    private void a(String str, String str2, long j, String str3) {
        Object[] objArr = {str, str2, new Long(j), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e6b2acaa24f0697758130aae922316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e6b2acaa24f0697758130aae922316");
        } else if (this.d == null || this.d.logicInfo.l == null) {
        } else {
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(Long.valueOf(System.currentTimeMillis()));
            JudasManualManager.a b = JudasManualManager.b(str);
            if (!aa.a(str3)) {
                b.a("poi_id", str3);
            } else if (j > 0) {
                b.a("poi_id", j);
            }
            if ("b_Gkeky".equals(str)) {
                b.a("money", this.d.logicInfo.l.B);
            }
            b.a("order_id", str2).a("order_status", this.d.logicInfo.l.e).a("status_code", this.d.logicInfo.l.x).a("viewtime", format).a("type", this.d.logicInfo.l.z).a("c_hgowsqb").a(this.b).a();
        }
    }
}
