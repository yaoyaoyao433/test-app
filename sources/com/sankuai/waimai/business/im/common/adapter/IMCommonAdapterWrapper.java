package com.sankuai.waimai.business.im.common.adapter;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IMCommonAdapterWrapper extends CommonAdapter {
    public static ChangeQuickRedirect a;
    private ICommonAdapter b;

    public IMCommonAdapterWrapper(ICommonAdapter iCommonAdapter) {
        Object[] objArr = {iCommonAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48dad9748fea3e29aa1a49c00c9bfce7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48dad9748fea3e29aa1a49c00c9bfce7");
        } else {
            this.b = iCommonAdapter;
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonClickAdapter
    public boolean onClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "375a618565955ebad9a67ad21a238fcd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "375a618565955ebad9a67ad21a238fcd")).booleanValue() : this.b.onClick(view, bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonClickAdapter
    public boolean onLongClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b40ccc147ad2c4fcb5c059824f38b009", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b40ccc147ad2c4fcb5c059824f38b009")).booleanValue() : this.b.onLongClick(view, bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getTimeStampVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deeafc72bcc749013dc6245992b1cf87", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deeafc72bcc749013dc6245992b1cf87")).intValue() : this.b.getTimeStampVisibility(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getMsgStatusVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e71588e5ccd6b184b4163f9cc0f434e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e71588e5ccd6b184b4163f9cc0f434e")).intValue() : this.b.getMsgStatusVisibility(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getStatusGravity(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98cf36eaa4343ab6f00bede67c9dac5b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98cf36eaa4343ab6f00bede67c9dac5b")).intValue() : this.b.getStatusGravity(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getProgressBarResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69f278fae5a4dc1bae4903dc68a66f1a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69f278fae5a4dc1bae4903dc68a66f1a")).intValue() : this.b.getProgressBarResource(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public String getTimeStamp(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da6dbb1d2a89a7968b0bf8dcfe93233", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da6dbb1d2a89a7968b0bf8dcfe93233") : this.b.getTimeStamp(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getMsgStatusTextColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "189546bb370cb6226cb5ba40358e25f1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "189546bb370cb6226cb5ba40358e25f1")).intValue() : this.b.getMsgStatusTextColor(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public void onMsgStatusClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1432d152f1a84f15887dbdc853196e5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1432d152f1a84f15887dbdc853196e5c");
        } else {
            this.b.onMsgStatusClick(view, bVar);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public void onMsgFailTipClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c83620dbe799bf2a829b0b1af3882ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c83620dbe799bf2a829b0b1af3882ae");
        } else {
            this.b.onMsgFailTipClick(view, bVar);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public int getStyle(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7c5baff89443d87130877c051481d9e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7c5baff89443d87130877c051481d9e")).intValue() : this.b.getStyle(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public int getBackgroundResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09c82c139b0d0f8c56d368a360423c5e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09c82c139b0d0f8c56d368a360423c5e")).intValue() : this.b.getBackgroundResource(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public int[] getPadding(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b503098aa4b66f2898a53a208279db30", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b503098aa4b66f2898a53a208279db30") : this.b.getPadding(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getTextColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0de24b8bb91b078a8fe26a96abbed585", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0de24b8bb91b078a8fe26a96abbed585")).intValue() : this.b.getTextColor(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getLinkColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729438868f9cb7c81e50575e8882a175", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729438868f9cb7c81e50575e8882a175")).intValue() : this.b.getLinkColor(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getTextFontSize(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd22e292173a9946c9c9c67eb10c36b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd22e292173a9946c9c9c67eb10c36b")).intValue() : this.b.getTextFontSize(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getLineSpacingExtra(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62b3480e7f8f11162bf2d725bed2b50", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62b3480e7f8f11162bf2d725bed2b50")).intValue() : this.b.getLineSpacingExtra(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public boolean hasLinkTextUnderLine(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e95c353b58087442098c1bdd60eca4d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e95c353b58087442098c1bdd60eca4d8")).booleanValue() : this.b.hasLinkTextUnderLine(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public boolean onTextLinkClick(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e5eefd8b6354ee734be71feb5a35868", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e5eefd8b6354ee734be71feb5a35868")).booleanValue() : this.b.onTextLinkClick(view, str);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getNickNameVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45c5100130ae9e028a590658ee62c7a0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45c5100130ae9e028a590658ee62c7a0")).intValue() : this.b.getNickNameVisibility(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getAvatarVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55618dd02845376b924ac23218eb90eb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55618dd02845376b924ac23218eb90eb")).intValue() : this.b.getAvatarVisibility(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getDefaultAvatarDrawableResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7b707afeae97c7570e901f672719220", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7b707afeae97c7570e901f672719220")).intValue() : this.b.getDefaultAvatarDrawableResource(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getAvatarSize(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f482e7e8ac2c78d8c8bc41eb1f6b33", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f482e7e8ac2c78d8c8bc41eb1f6b33")).intValue() : this.b.getAvatarSize(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getAvatarCornerRadius(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5cc9d1bbcf61e12ebc723ca2e4e119a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5cc9d1bbcf61e12ebc723ca2e4e119a")).intValue() : this.b.getAvatarCornerRadius(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public void onAvatarClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83910eadef041b0587be92920e06d2bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83910eadef041b0587be92920e06d2bf");
        } else {
            this.b.onAvatarClick(view, bVar);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public boolean onAvatarLongClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb34c3780d8e7fc54fffffb0688502a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb34c3780d8e7fc54fffffb0688502a")).booleanValue() : this.b.onAvatarLongClick(view, bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.impl.BaseMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1464461e325d6f679610613084a35db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1464461e325d6f679610613084a35db");
            return;
        }
        super.init(context);
        this.b.init(context);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.impl.BaseMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dc0c80ab08e4a83eb9ff63a6ae19019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dc0c80ab08e4a83eb9ff63a6ae19019");
            return;
        }
        super.release();
        this.b.release();
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
    public int getBottomSideLayout(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "329ee04650639f57f8079556d4f16cde", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "329ee04650639f57f8079556d4f16cde")).intValue() : this.b.getBottomSideLayout(context, bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
    public int getInnerSideLayout(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a318d4df3f5fc1f93ae1d11e7e3cc254", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a318d4df3f5fc1f93ae1d11e7e3cc254")).intValue() : this.b.getInnerSideLayout(context, bVar);
    }
}
