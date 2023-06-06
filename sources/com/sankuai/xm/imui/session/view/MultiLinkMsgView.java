package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
import com.sankuai.xm.im.message.bean.MultiLinkMessage;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IMultiLinkMsgAdapter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MultiLinkMsgView extends BaseCommonView<MultiLinkMessage, IMultiLinkMsgAdapter> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view, b<MultiLinkMessage> bVar) {
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public int getContentLayoutResourceId() {
        return R.layout.xm_sdk_chat_multi_link_msg;
    }

    public MultiLinkMsgView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b880853a6b6e85e32888393343a25347", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b880853a6b6e85e32888393343a25347");
        }
    }

    private MultiLinkMsgView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c309e43fa6baea9729f9ad8ab146a592", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c309e43fa6baea9729f9ad8ab146a592");
        }
    }

    public MultiLinkMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8f6818191c52d17eacaf0c90bd15ef3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8f6818191c52d17eacaf0c90bd15ef3");
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(final b<MultiLinkMessage> bVar) {
        View inflate;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48770e73f68c659f70d4c029b1679cd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48770e73f68c659f70d4c029b1679cd0");
            return;
        }
        setShowTimeStamp(true);
        super.a(bVar);
        try {
            ViewGroup viewGroup = (ViewGroup) this.l.findViewById(R.id.item_container);
            viewGroup.removeAllViews();
            List<a> a2 = a(bVar.b.getContent());
            for (int i = 0; i < a2.size(); i++) {
                int otherLinksDescriptionLine = ((IMultiLinkMsgAdapter) this.r).getOtherLinksDescriptionLine();
                if (i == 0) {
                    inflate = inflate(this.o, R.layout.xm_sdk_chat_multi_link_msg_rich_card_head, null);
                } else {
                    inflate = inflate(this.o, R.layout.xm_sdk_chat_multi_link_msg_rich_card_item, null);
                }
                viewGroup.addView(inflate);
                final a aVar = a2.get(i);
                View findViewById = inflate.findViewById(R.id.img_multi_item);
                if (i == 0) {
                    com.sankuai.xm.integration.imageloader.b.a(com.sankuai.xm.integration.imageloader.utils.a.b(aVar.b)).b(R.drawable.xm_sdk_img_default).c(R.drawable.xm_sdk_img_no_exist).a(1).a(findViewById);
                } else {
                    com.sankuai.xm.integration.imageloader.b.a(com.sankuai.xm.integration.imageloader.utils.a.b(aVar.b)).b(R.drawable.xm_sdk_img_default).c(R.drawable.xm_sdk_img_no_exist).a(0).a(findViewById);
                }
                TextView textView = (TextView) inflate.findViewById(R.id.title);
                if (otherLinksDescriptionLine < 0) {
                    otherLinksDescriptionLine = Integer.MAX_VALUE;
                }
                textView.setMaxLines(otherLinksDescriptionLine);
                textView.setText(aVar.a);
                inflate.setTag(aVar);
                inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.session.view.MultiLinkMsgView.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf1faa72f167ef86d165ad908f9ad4f0", 6917529027641081858L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf1faa72f167ef86d165ad908f9ad4f0");
                        } else {
                            ((IMultiLinkMsgAdapter) MultiLinkMsgView.this.r).onArticleItemClick(view, bVar, aVar.d, aVar.a);
                        }
                    }
                });
                inflate.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.xm.imui.session.view.MultiLinkMsgView.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5e04a9dcbe09e14f8c04716b7455b12", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5e04a9dcbe09e14f8c04716b7455b12")).booleanValue() : ((IMultiLinkMsgAdapter) MultiLinkMsgView.this.r).onArticleItemLongClick(view, bVar, aVar.d, aVar.a) || MultiLinkMsgView.this.q.onLongClick(MultiLinkMsgView.this, bVar);
                    }
                });
            }
        } catch (Exception e) {
            com.sankuai.xm.monitor.statistics.a.a("imui", "MultiLinkMsgView::bindView", e);
            d.d("MultiLinkMsgView.bindView,parse view,ex=" + e.toString(), new Object[0]);
            com.sankuai.xm.monitor.statistics.a.a("imui", "MultiLinkMsgView::bindView", e);
        }
    }

    private static List<a> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b45315216f4f67430d65384abc094ced", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b45315216f4f67430d65384abc094ced");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = new JSONObject(jSONArray.get(i).toString());
                a aVar = new a();
                if (jSONObject.has("title")) {
                    aVar.a = jSONObject.getString("title");
                }
                if (jSONObject.has("image")) {
                    aVar.b = jSONObject.getString("image");
                }
                if (jSONObject.has("content")) {
                    aVar.c = jSONObject.getString("content");
                }
                if (jSONObject.has(RegionLinkDao.TABLENAME)) {
                    aVar.d = jSONObject.getString(RegionLinkDao.TABLENAME);
                }
                arrayList.add(aVar);
            }
        } catch (Exception e) {
            com.sankuai.xm.monitor.statistics.a.a("imui", "MultiLinkMsgView::getArticles", e);
            d.d("MultiLinkMsgView::getArticles,str= " + str + ",ex=" + e.toString(), new Object[0]);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public String a;
        public String b;
        public String c;
        public String d;

        public a() {
        }
    }
}
