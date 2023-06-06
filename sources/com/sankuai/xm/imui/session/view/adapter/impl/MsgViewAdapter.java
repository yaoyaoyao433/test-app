package com.sankuai.xm.imui.session.view.adapter.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MsgViewAdapter implements IMsgViewAdapter {
    public static ChangeQuickRedirect d;

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
    public ICommonAdapter getCommonAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "666fe23e62ca22a2f95a14fef420830d", 6917529027641081856L) ? (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "666fe23e62ca22a2f95a14fef420830d") : new CommonAdapter();
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
    public IExtraAdapter getExtraAdapter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ec4dd1b6ed72096a118c013c4d6b643", 6917529027641081856L)) {
            return (IExtraAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ec4dd1b6ed72096a118c013c4d6b643");
        }
        switch (i) {
            case 0:
                return new TextMsgAdapter();
            case 1:
                return new AudioMsgAdapter();
            case 2:
                return new VideoMsgAdapter();
            case 3:
                return new ImageMsgAdapter();
            case 4:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                return null;
            case 5:
                return new LinkMsgAdapter();
            case 6:
                return new MultiLinkMsgAdapter();
            case 7:
                return new FileMsgAdapter();
            case 10:
                return new EmotionMsgAdapter();
            case 11:
                return new EventMsgAdapter();
            case 18:
                return new UnknownMsgAdapter();
            case 19:
                return new LongTextMsgAdapter();
            case 20:
                return new PubLinkMsgAdapter();
            case 21:
                return new PubMultiLinkMsgAdapter();
        }
    }
}
