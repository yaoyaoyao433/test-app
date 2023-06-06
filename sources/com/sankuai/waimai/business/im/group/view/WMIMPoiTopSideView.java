package com.sankuai.waimai.business.im.group.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.common.view.message.AbstractMsgSideView;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMIMPoiTopSideView extends AbstractMsgSideView {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView e;

    public WMIMPoiTopSideView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "333ffdd110869cd423a8a6c483017f31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "333ffdd110869cd423a8a6c483017f31");
        }
    }

    public WMIMPoiTopSideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "100df7ff2b34cc16958d53e91bda5524", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "100df7ff2b34cc16958d53e91bda5524");
        }
    }

    public WMIMPoiTopSideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2363d88fea537c5685bbd8839796a7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2363d88fea537c5685bbd8839796a7f");
            return;
        }
        inflate(context, R.layout.wm_im_top_view, this);
        this.b = (TextView) findViewById(R.id.nick_name);
        this.e = (TextView) findViewById(R.id.role_name);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2d10e55b84effe8990045893b8ec5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2d10e55b84effe8990045893b8ec5a");
            return;
        }
        super.a(bVar);
        f(bVar);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView
    public final void c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77baf212a6ff34adaf61b5c990c6222b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77baf212a6ff34adaf61b5c990c6222b");
            return;
        }
        super.c(bVar);
        f(bVar);
    }

    private void f(b bVar) {
        String optString;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7708a93a085f6011afacaaa864fd1dfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7708a93a085f6011afacaaa864fd1dfc");
            return;
        }
        ICommonAdapter b = com.sankuai.xm.imui.session.b.b(this);
        int nickNameVisibility = b == null ? 8 : b.getNickNameVisibility(bVar);
        l.a(nickNameVisibility, this.b);
        if (nickNameVisibility == 0 && bVar != null) {
            try {
                JSONObject jSONObject = new JSONObject(bVar.b.getExtension());
                if (jSONObject.optString("role_type", "").equals("4")) {
                    this.e.setVisibility(0);
                    optString = bVar.d;
                } else {
                    this.e.setVisibility(8);
                    optString = jSONObject.optString("c_name", "");
                }
                if (!TextUtils.isEmpty(optString)) {
                    this.b.setText(optString);
                } else {
                    this.b.setText("");
                }
            } catch (Exception unused) {
            }
        }
    }
}
