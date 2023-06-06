package com.sankuai.waimai.business.user.comment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.interfaces.d;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.f;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FriendCommentActivity extends BaseUserCommentListActivity {
    public static ChangeQuickRedirect v;
    private f.b D;

    public FriendCommentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c35444d5750fa5677df8f6f263731ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c35444d5750fa5677df8f6f263731ba");
        } else {
            this.D = new f.b() { // from class: com.sankuai.waimai.business.user.comment.FriendCommentActivity.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.log.judas.f.b
                public final void b(int i) {
                }

                @Override // com.sankuai.waimai.log.judas.f.b
                public final void a(int i) {
                    Comment item;
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7e4d9cd09f9016bb2f95e490111d64d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7e4d9cd09f9016bb2f95e490111d64d");
                    } else if (i < 0 || FriendCommentActivity.this.j == null || i >= FriendCommentActivity.this.j.getCount() || (item = FriendCommentActivity.this.j.getItem(i)) == null) {
                    } else {
                        JudasManualManager.b("b_1c9oni2g").a("poi_id", item.poiId).a(FriendCommentActivity.this).a("c_gmmpca6k").a();
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "197af9e69ab8c554db2bb72689bc6b16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "197af9e69ab8c554db2bb72689bc6b16");
            return;
        }
        super.onCreate(bundle);
        this.i.setOnLogReportListener(this.D);
    }

    @Override // com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity
    public final a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7bcee124ef19115a03e22419acfa681", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7bcee124ef19115a03e22419acfa681") : new a(this, 3, this, "");
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35518d86574870d45a111a8560774566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35518d86574870d45a111a8560774566");
            return;
        }
        JudasManualManager.a("c_gmmpca6k", this);
        super.onResume();
        g();
    }

    @Override // com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity
    public final String d() {
        return this.s;
    }

    @Override // com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity
    public final long i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "754044c7195ca9b3de8db027c0f0f8e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "754044c7195ca9b3de8db027c0f0f8e7")).longValue();
        }
        Intent intent = getIntent();
        long a = com.sankuai.waimai.platform.utils.f.a(intent, "user_id", -1L);
        if (a == -1) {
            a = com.sankuai.waimai.foundation.router.a.a(intent, "user_id", -1L);
        }
        return a == -1 ? a(intent, "user_id", -1L) : a;
    }

    private long a(@NonNull Intent intent, String str, long j) {
        Object[] objArr = {intent, str, -1L};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf0a91aa2a5aa1b2853967287d44495", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf0a91aa2a5aa1b2853967287d44495")).longValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter(str);
            if (TextUtils.isEmpty(queryParameter)) {
                return -1L;
            }
            try {
                return Long.parseLong(queryParameter);
            } catch (Exception e) {
                if (d.a()) {
                    ae.a(b.a, ab.a((int) R.string.wm_platform_router_parse_failed, str, queryParameter));
                }
                com.sankuai.waimai.foundation.utils.log.a.b("WMRouter", e);
                return -1L;
            }
        }
        return -1L;
    }
}
