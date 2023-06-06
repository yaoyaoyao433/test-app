package com.sankuai.waimai.business.page.kingkong.future.network;

import android.support.v4.app.FragmentActivity;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.home.utils.k;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.monitor.DovePageMonitor;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.utils.m;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.business.page.kingkong.a b;
    FragmentActivity c;
    com.sankuai.waimai.business.page.common.net.request.a d;
    private KingkongInfo e;
    private String f;
    private e g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(BaseResponse<RocksServerModel> baseResponse) throws JSONException;

        void a(Throwable th);
    }

    public b(com.sankuai.waimai.business.page.kingkong.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ea4eec466d0fc74b66e09a7ef5c1116", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ea4eec466d0fc74b66e09a7ef5c1116");
            return;
        }
        this.b = aVar;
        this.c = aVar.b();
        this.e = aVar.w.a().b;
        this.f = aVar.R.a().b;
        this.g = aVar.u.a().b;
        if (this.g != null) {
            this.d = this.g.b(1);
        }
        this.f = aVar.R.a().b;
    }

    public final void a(final int i, final a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a90cbedf231a12b432bbcf0293b1ea4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a90cbedf231a12b432bbcf0293b1ea4");
        } else if (this.d == null || this.g == null) {
        } else {
            this.g.a(i);
            aVar.a();
            boolean z = this.e.b != 910 ? false : com.sankuai.waimai.business.page.common.list.ai.f.a().c;
            String str = "";
            WmAddress k = g.a().k();
            if (k != null && k.hasAddress()) {
                str = k.getAddress();
            }
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FKKApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FKKApi.class)).channelMainlist(this.d.r, this.d.s, z, this.d.b, this.d.c, this.d.d, this.d.f, this.d.g, this.d.i, this.d.j, this.d.k, this.d.l, this.d.p, this.d.q, Statistics.getSession(), OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId(), this.d.t, this.d.u, str), new b.AbstractC1042b<BaseResponse<RocksServerModel>>() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.b.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse<RocksServerModel> baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "913c0e14a15b00e610a4ab4d1c7b4796", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "913c0e14a15b00e610a4ab4d1c7b4796");
                    } else if (baseResponse == null || baseResponse.data == null || baseResponse.code != 0) {
                        com.sankuai.waimai.business.page.kingkong.future.monitor.c.a(baseResponse, "v6/channel/feeds/list");
                        if (i != 6) {
                            if (i == 3 && baseResponse != null) {
                                m.a(b.this.c, baseResponse.msg);
                            }
                            if (aVar != null) {
                                aVar.a(new Throwable("NET_ERROR"));
                            }
                            DovePageMonitor.a(b.this.c, (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM);
                        }
                    } else {
                        com.sankuai.waimai.business.page.kingkong.future.ai.b.a().c();
                        if (com.sankuai.waimai.foundation.utils.d.a(baseResponse.data.moduleList)) {
                            if (i != 6) {
                                if (i == 3) {
                                    m.a(b.this.c, "暂无更多~");
                                }
                                String str2 = i == 4 ? "EMPTY_POI_LIST" : "EMPTY_DATA";
                                if (aVar != null) {
                                    aVar.a(new Throwable(str2));
                                }
                                DovePageMonitor.a(b.this.c, (int) UserCenter.TYPE_LOGOUT_NEGATIVE);
                                return;
                            }
                            return;
                        }
                        b.this.b.ab.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(i));
                        ListIDHelper listIDHelper = ListIDHelper.a.a;
                        listIDHelper.a("page", k.l + CommonConstant.Symbol.UNDERLINE + b.this.d.i, b.this.d.q);
                        if (aVar != null) {
                            try {
                                aVar.a(baseResponse);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c10b4b58a5037898769cb8a184bc2ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c10b4b58a5037898769cb8a184bc2ee");
                    } else if (i == 6) {
                    } else {
                        if (i == 3 && th != null) {
                            m.a(b.this.c, "请检查网络设置或稍后再试");
                        }
                        if (aVar != null) {
                            aVar.a(new Throwable("NET_ERROR"));
                        }
                        com.sankuai.waimai.business.page.kingkong.future.monitor.c.a(null, "v6/channel/feeds/list");
                        DovePageMonitor.a(b.this.c, (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
                    }
                }
            }, this.f);
        }
    }
}
