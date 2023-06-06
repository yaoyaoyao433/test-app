package com.sankuai.waimai.business.search.ui;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.alita.a;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.business.search.datatype.CommonMachData;
import com.sankuai.waimai.business.search.model.GlobalPageResponse;
import com.sankuai.waimai.business.search.model.PrescriptionRemindInfo;
import com.sankuai.waimai.business.search.ui.result.mach.i;
import com.sankuai.waimai.mach.recycler.b;
import com.sankuai.waimai.modular.eventbus.sharedata.SharedData;
import com.sankuai.waimai.search.common.mach.provider.IMachProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SearchShareData extends SharedData {
    public static ChangeQuickRedirect a;
    public static b s;
    public static b t;
    public boolean A;
    public boolean B;
    public Map<String, String> C;
    public Map<String, String> D;
    public long E;
    public long F;
    public int G;
    public String H;
    public String I;
    public int J;
    public int K;
    public int L;
    public int M;
    public String N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public String S;
    public String T;
    public int U;
    public boolean V;
    public String W;
    public Map<String, String> X;
    public String Y;
    public boolean Z;
    public String aa;
    public String ab;
    public String ac;
    public Map<Integer, String> ad;
    public String ae;
    public String af;
    public String ag;
    public String ah;
    public i ai;
    public GlobalPageResponse.a aj;
    public com.sankuai.waimai.platform.widget.filterbar.view.model.a ak;
    public boolean al;
    public int am;
    public String an;
    public PrescriptionRemindInfo ao;
    public boolean ap;
    public a.C0859a aq;
    public boolean ar;
    public boolean as;
    public String at;
    public int au;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public List<String> i;
    public int j;
    public int k;
    public String l;
    public String m;
    public String n;
    public RecommendedSearchKeyword o;
    public RecommendedSearchKeyword p;
    public int q;
    public ArrayList<RecommendedSearchKeyword> r;
    public Map<Serializable, CommonMachData> u;
    public long v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public SearchShareData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "569f2e99e1536d3301b5f90b5bb46e70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "569f2e99e1536d3301b5f90b5bb46e70");
            return;
        }
        this.j = 0;
        this.k = 1;
        this.l = "";
        this.q = 0;
        this.u = new ConcurrentHashMap();
        this.B = false;
        this.C = new ConcurrentHashMap();
        this.D = new ConcurrentHashMap();
        this.am = 0;
        this.ar = false;
        this.as = false;
        this.at = "";
        this.au = 0;
    }

    static {
        IMachProvider iMachProvider = (IMachProvider) com.sankuai.waimai.router.a.a(IMachProvider.class, "wm");
        if (iMachProvider != null) {
            s = iMachProvider.machLogicList();
        } else {
            s = new b("waimai");
        }
        t = new b("waimai");
    }

    public final boolean b() {
        return this.O == 200;
    }

    public static SearchShareData a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ab0a38936878afb72a94c375a80419d", RobustBitConfig.DEFAULT_VALUE) ? (SearchShareData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ab0a38936878afb72a94c375a80419d") : (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(context, SearchShareData.class);
    }
}
