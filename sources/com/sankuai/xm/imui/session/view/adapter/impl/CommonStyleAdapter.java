package com.sankuai.xm.imui.session.view.adapter.impl;

import android.content.res.Resources;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.MsgViewType;
import com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CommonStyleAdapter extends BaseMsgAdapter implements ICommonStyleAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public int getStyle(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b2efa474927b2d9cb0b154b15282a5d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b2efa474927b2d9cb0b154b15282a5d")).intValue();
        }
        int a2 = MsgViewType.a(bVar.b);
        if (a2 == 11 || a2 == 13) {
            return 3;
        }
        switch (a2) {
            case 20:
            case 21:
                if (bVar.b != 0 && bVar.b.getFromUid() != IMUIManager.a().e()) {
                    return 3;
                }
                break;
        }
        return (bVar.b == 0 || bVar.b.getFromUid() != IMUIManager.a().e()) ? 1 : 2;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public int getBackgroundResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef76dfc8604cb171476d7d9c2b15171", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef76dfc8604cb171476d7d9c2b15171")).intValue();
        }
        switch (MsgViewType.a(bVar.b)) {
            case 0:
            case 1:
            case 18:
            case 19:
                if (bVar.g == 1) {
                    return R.drawable.xm_sdk_chat_msg_bg_left_default;
                }
                if (bVar.g == 2) {
                    return R.drawable.xm_sdk_chat_msg_bg_right_default;
                }
                return 0;
            case 2:
            case 3:
            case 10:
            case 11:
            case 22:
                return 0;
            default:
                return R.drawable.xm_sdk_chat_msg_bg_left_default;
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public int[] getPadding(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6164e4bed230f9ef8ecfed044d1d2ca", 6917529027641081856L)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6164e4bed230f9ef8ecfed044d1d2ca");
        }
        Resources resources = this.e.getResources();
        switch (MsgViewType.a(bVar.b)) {
            case 0:
            case 1:
            case 5:
            case 6:
            case 18:
            case 19:
            case 20:
            case 21:
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.xm_sdk_text_msg_padding_vertical);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.xm_sdk_text_msg_padding_horizon);
                return new int[]{dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize};
            default:
                return null;
        }
    }
}
