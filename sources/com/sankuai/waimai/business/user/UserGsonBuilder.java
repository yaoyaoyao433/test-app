package com.sankuai.waimai.business.user;

import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.user.comment.net.response.CommentShortLinkResponse;
import com.sankuai.waimai.business.user.comment.net.response.MyCommentResponse;
import com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UserGsonBuilder extends AbstractGsonBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder
    public void registerWmApiProviderTypeAdapter(GsonBuilder gsonBuilder) {
        Object[] objArr = {gsonBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de7187aa4ac128aaa9e743bbd15608b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de7187aa4ac128aaa9e743bbd15608b6");
        } else {
            gsonBuilder.registerTypeAdapter(MyCommentResponse.class, new MyCommentResponse.Deserializer()).registerTypeAdapter(CommentShortLinkResponse.class, new CommentShortLinkResponse.Deserializer());
        }
    }
}
