package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.n;
import com.sankuai.xm.file.proxy.f;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.imui.common.util.g;
import com.sankuai.xm.imui.common.view.AdaptiveImageView;
import com.sankuai.xm.imui.common.view.shape.b;
import com.sankuai.xm.imui.common.view.shape.d;
import com.sankuai.xm.imui.session.c;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IImageMsgAdapter;
import com.sankuai.xm.integration.mediapreviewer.IMediaPreviewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ImageMsgView extends MediaMsgView<ImageMessage, IImageMsgAdapter> {
    public static ChangeQuickRedirect a;
    private AdaptiveImageView t;
    private View u;
    private String v;
    private c.a w;

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public int getContentLayoutResourceId() {
        return R.layout.xm_sdk_msg_image_content;
    }

    public ImageMsgView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0644e969648c901afab27bcf742f34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0644e969648c901afab27bcf742f34");
        }
    }

    private ImageMsgView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ea74bc05758b4b4f8953cbc5b69005f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ea74bc05758b4b4f8953cbc5b69005f");
        }
    }

    public ImageMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf35e27c59ecea25dd339a49db18fc1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf35e27c59ecea25dd339a49db18fc1e");
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view, b<ImageMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40fe174bff3742ef2f5689df57cefea8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40fe174bff3742ef2f5689df57cefea8");
            return;
        }
        if (this.l instanceof d) {
            com.sankuai.xm.imui.common.view.shape.b bVar2 = new com.sankuai.xm.imui.common.view.shape.b();
            b.a aVar = new b.a();
            aVar.a = getContext().getResources().getDisplayMetrics().density;
            float shapeCornerRadius = ((IImageMsgAdapter) this.r).getShapeCornerRadius(bVar);
            if (shapeCornerRadius < 0.0f) {
                shapeCornerRadius = getResources().getDimensionPixelOffset(R.dimen.xm_sdk_msg_bg_corner_radius);
            }
            aVar.e = shapeCornerRadius;
            aVar.f = getStyle() == 1;
            aVar.c = getContext().getResources().getColor(R.color.xm_sdk_divider);
            aVar.b = getContext().getResources().getDimension(R.dimen.xm_sdk_divider_width);
            bVar2.a(aVar);
            ((d) this.l).setShape(bVar2);
        }
        this.t = (AdaptiveImageView) this.l.findViewById(R.id.xm_sdk_chat_img_adaptive_view);
        this.t.b = false;
        this.u = this.l.findViewById(R.id.xm_sdk_gif_icon);
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85c39eaac7488b6bebdc54b201446763", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85c39eaac7488b6bebdc54b201446763");
        } else if (a()) {
            c();
        } else {
            ImageMessage imageMessage = (ImageMessage) this.n.b;
            if (ac.a(imageMessage.getThumbnailUrl()) && ac.a(imageMessage.getThumbnailPath()) && ac.a(imageMessage.getNormalUrl()) && ac.a(imageMessage.getPath()) && ac.a(imageMessage.getOriginUrl()) && ac.a(this.v)) {
                c();
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<com.sankuai.xm.imui.session.entity.b> it = this.w.c().iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.sankuai.xm.imui.session.entity.b next = it.next();
                arrayList2.add(next.b);
                if (next.b instanceof ImageMessage) {
                    ImageMessage imageMessage2 = (ImageMessage) next.b;
                    if (ac.a(imageMessage2.getMsgUuid(), imageMessage.getMsgUuid())) {
                        i2 = i;
                    }
                    com.sankuai.xm.integration.mediapreviewer.a aVar = new com.sankuai.xm.integration.mediapreviewer.a();
                    aVar.b = k.f(imageMessage2.getThumbnailPath()) ? com.sankuai.xm.integration.imageloader.utils.a.a(imageMessage2.getThumbnailPath()) : null;
                    aVar.c = k.f(imageMessage2.getPath()) ? com.sankuai.xm.integration.imageloader.utils.a.a(imageMessage2.getPath()) : null;
                    aVar.d = !ac.a(imageMessage2.getThumbnailUrl()) ? com.sankuai.xm.integration.imageloader.utils.a.b(imageMessage2.getThumbnailUrl()) : null;
                    a(aVar, aVar.d, imageMessage2);
                    aVar.e = !ac.a(imageMessage2.getNormalUrl()) ? com.sankuai.xm.integration.imageloader.utils.a.b(imageMessage2.getNormalUrl()) : null;
                    a(aVar, aVar.e, imageMessage2);
                    aVar.f = ac.a(imageMessage2.getOriginUrl()) ? null : com.sankuai.xm.integration.imageloader.utils.a.b(imageMessage2.getOriginUrl());
                    a(aVar, aVar.f, imageMessage2);
                    arrayList.add(aVar);
                    i++;
                }
            }
            String b = this.n.b();
            Context context = getContext();
            String h = com.sankuai.xm.imui.b.a().h();
            g.a().a(h, arrayList2);
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.integration.mediapreviewer.b.a;
            com.sankuai.xm.integration.mediapreviewer.b bVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e4edd72c0e02f599a593041d3e5958f5", 6917529027641081856L) ? (com.sankuai.xm.integration.mediapreviewer.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e4edd72c0e02f599a593041d3e5958f5") : new com.sankuai.xm.integration.mediapreviewer.b(context);
            bVar.b.b = b;
            bVar.b.c = h;
            bVar.b.a = i2;
            Object[] objArr3 = {arrayList};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.integration.mediapreviewer.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "618168bb2ebeab3a39faceb5e5b9fb9b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "618168bb2ebeab3a39faceb5e5b9fb9b");
                return;
            }
            IMediaPreviewer iMediaPreviewer = (IMediaPreviewer) m.a(IMediaPreviewer.class);
            if (iMediaPreviewer == null) {
                iMediaPreviewer = (IMediaPreviewer) m.a(IMediaPreviewer.class);
            }
            if (iMediaPreviewer != null) {
                iMediaPreviewer.a(bVar.c, bVar.b, arrayList);
                return;
            }
            ad.a(bVar.c, (int) R.string.xm_sdk_image_preview_no_service);
            com.sankuai.xm.log.c.c("MediaPreviewBuilder", "previewImage:: media previewer proxy is not available.", new Object[0]);
        }
    }

    private static void a(com.sankuai.xm.integration.mediapreviewer.a aVar, Uri uri, ImageMessage imageMessage) {
        Object[] objArr = {aVar, uri, imageMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        HashMap<String, String> hashMap = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a369e864ca064620ebfea530b952cdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a369e864ca064620ebfea530b952cdc");
            return;
        }
        if (uri != null && f.b(uri.toString())) {
            hashMap = new HashMap<>(f.a(uri.toString(), f.b(uri.toString(), true)));
            hashMap.put("X-Xmftk", imageMessage.getToken());
        }
        if (hashMap != null) {
            aVar.a(uri, hashMap);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(com.sankuai.xm.imui.session.entity.b<ImageMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2651941183f9243e9b26f4a1cbe29ce1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2651941183f9243e9b26f4a1cbe29ce1");
            return;
        }
        super.a(bVar);
        ImageMessage imageMessage = bVar.b;
        Object[] objArr2 = {imageMessage};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2290dc88ebd5ceb944bd58126817d7fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2290dc88ebd5ceb944bd58126817d7fe");
        } else {
            int thumbnailWidth = imageMessage.getThumbnailWidth();
            int thumbnailHeight = imageMessage.getThumbnailHeight();
            if (thumbnailWidth == 0 || thumbnailHeight == 0) {
                thumbnailWidth = n.b(imageMessage.getThumbnailUrl());
                thumbnailHeight = n.c(imageMessage.getThumbnailUrl());
            }
            com.sankuai.xm.imui.common.util.d.b("ImageMsgView::resize:: %s %s %s", Integer.valueOf(thumbnailWidth), Integer.valueOf(thumbnailHeight), Integer.valueOf(imageMessage.getOrientation()));
            int[] a2 = n.a(com.sankuai.xm.imui.common.util.k.a(getContext(), thumbnailWidth), com.sankuai.xm.imui.common.util.k.a(getContext(), thumbnailHeight), imageMessage.getOrientation(), getResources().getDimensionPixelSize(R.dimen.xm_sdk_image_msg_max_size), getResources().getDimensionPixelSize(R.dimen.xm_sdk_image_msg_min_size));
            this.t.a(a2[0], a2[1]);
            this.l.invalidate();
            this.l.requestLayout();
        }
        if (a()) {
            b();
        } else {
            c();
        }
    }

    @Override // com.sankuai.xm.imui.session.view.MediaMsgView
    public final void a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fc969e6e2d20923db836b23df8f85fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fc969e6e2d20923db836b23df8f85fb");
            return;
        }
        super.a(str, i, i2);
        ImageMessage imageMessage = (ImageMessage) this.n.b;
        if (i == 3) {
            c();
            return;
        }
        switch (i) {
            case 7:
                if (ac.a(str) || !ac.a(str, imageMessage.getThumbnailUrl(), imageMessage.getNormalUrl())) {
                    return;
                }
                b();
                return;
            case 8:
                if (ac.a(str) || !ac.a(str, imageMessage.getThumbnailUrl(), imageMessage.getNormalUrl())) {
                    return;
                }
                c();
                return;
            default:
                return;
        }
    }

    public void setPresenter(c.a aVar) {
        this.w = aVar;
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faab4227f69017e2c301debd3d3fb222", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faab4227f69017e2c301debd3d3fb222")).booleanValue();
        }
        Bundle bundle = this.n.o;
        StringBuilder sb = new StringBuilder("xm_sdk_");
        sb.append(((ImageMessage) this.n.b).getThumbnailUrl());
        return bundle.getInt(sb.toString(), -1) == 7;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60cd73786d367a7c15c2eb05d69993f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60cd73786d367a7c15c2eb05d69993f4");
            return;
        }
        this.t.a(R.drawable.xm_sdk_img_no_exist, com.sankuai.xm.imui.common.util.k.a(getContext(), 24.0f), com.sankuai.xm.imui.common.util.k.a(getContext(), 42.0f));
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ec37e71a52000680aa4eb28f678a89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ec37e71a52000680aa4eb28f678a89");
            return;
        }
        this.t.setVisibility(0);
        ImageMessage imageMessage = (ImageMessage) this.n.b;
        boolean i = n.i(imageMessage.getType());
        this.u.setVisibility(i ? 0 : 8);
        String thumbnailUrl = imageMessage.getThumbnailUrl();
        if (!i && imageMessage.getOrientation() == 0 && !ac.a(thumbnailUrl)) {
            imageMessage.setOrientation(n.d(thumbnailUrl));
        }
        this.v = null;
        String b = IMClient.a().b(4);
        String thumbnailPath = imageMessage.getThumbnailPath();
        if (!ac.a(thumbnailUrl) && (ac.a(thumbnailPath) || !k.o(thumbnailPath))) {
            thumbnailPath = k.f(IMClient.a().s(), k.c(thumbnailUrl));
        }
        if (k.o(thumbnailPath)) {
            this.v = thumbnailPath;
            com.sankuai.xm.imui.common.util.d.b("ImageMsgView::loadImg::thumbnailPath %s", thumbnailPath);
        } else {
            String path = imageMessage.getPath();
            if (ac.a(path) && !ac.a(imageMessage.getOriginUrl())) {
                path = k.f(b, k.c(imageMessage.getOriginUrl()));
            }
            if (k.o(path)) {
                this.v = path;
                com.sankuai.xm.imui.common.util.d.b("ImageMsgView::loadImg::originPath %s", path);
            } else if (!ac.a(imageMessage.getNormalUrl())) {
                String f = k.f(b, k.c(imageMessage.getNormalUrl()));
                if (k.o(f)) {
                    this.v = f;
                    com.sankuai.xm.imui.common.util.d.b("ImageMsgView::loadImg::normalPath %s", f);
                }
            }
        }
        if (!ac.a(this.v)) {
            if (i) {
                this.u.setVisibility(0);
            }
            this.t.a(com.sankuai.xm.integration.imageloader.utils.a.a(this.v), Boolean.valueOf(i));
            return;
        }
        Bundle bundle = this.n.o;
        bundle.remove("xm_sdk_" + thumbnailUrl);
        IMClient.a().a(imageMessage, thumbnailUrl, thumbnailPath, 2);
        int a2 = com.sankuai.xm.imui.common.util.k.a(getContext(), 20.0f);
        this.t.a(R.drawable.xm_sdk_progress_loading, a2, a2);
    }
}
