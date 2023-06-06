package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.n;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.im.message.handler.w;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.common.view.AdaptiveImageView;
import com.sankuai.xm.imui.common.view.shape.b;
import com.sankuai.xm.imui.common.view.shape.d;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IVideoMsgAdapter;
import com.sankuai.xm.video.PlayVideoActivity;
import com.sankuai.xm.video.RoundProgressBar;
import com.sankuai.xm.video.f;
import com.tencent.connect.share.QzonePublish;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VideoMsgView extends MediaMsgView<VideoMessage, IVideoMsgAdapter> {
    public static ChangeQuickRedirect a;
    private AdaptiveImageView t;
    private TextView u;
    private RoundProgressBar v;
    private View w;

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public int getContentLayoutResourceId() {
        return R.layout.xm_sdk_msg_view_video;
    }

    public VideoMsgView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d16e2e6794d25882e1e7c1e64ffabd00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d16e2e6794d25882e1e7c1e64ffabd00");
        }
    }

    private VideoMsgView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ca2b27db4f34f2edf038ca1466f0a2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ca2b27db4f34f2edf038ca1466f0a2b");
        }
    }

    public VideoMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d5cebf14243396be429c69c8d926188", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d5cebf14243396be429c69c8d926188");
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view, b<VideoMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ee5140c48328d3e2c35064670b2118", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ee5140c48328d3e2c35064670b2118");
            return;
        }
        if (this.l instanceof d) {
            com.sankuai.xm.imui.common.view.shape.b bVar2 = new com.sankuai.xm.imui.common.view.shape.b();
            b.a aVar = new b.a();
            aVar.a = getContext().getResources().getDisplayMetrics().density;
            float shapeCornerRadius = ((IVideoMsgAdapter) this.r).getShapeCornerRadius(bVar);
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
        this.t = (AdaptiveImageView) view.findViewById(R.id.xm_sdk_video_msg_iv_screenshot);
        this.w = view.findViewById(R.id.xm_sdk_video_msg_iv_icon);
        this.u = (TextView) view.findViewById(R.id.xm_sdk_video_msg_tv_dur);
        this.v = (RoundProgressBar) view.findViewById(R.id.xm_sdk_video_msg_progress);
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view) {
        String str;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75297f475d171692864d51df79317b43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75297f475d171692864d51df79317b43");
        } else if (a()) {
            b();
        } else {
            VideoMessage videoMessage = (VideoMessage) this.n.b;
            if (videoMessage.getFileStatus() == 6) {
                return;
            }
            String path = videoMessage.getPath();
            String url = videoMessage.getUrl();
            if (TextUtils.isEmpty(path) && TextUtils.isEmpty(url)) {
                ad.a(getContext(), (int) R.string.xm_sdk_msg_video_open_fail);
                com.sankuai.xm.imui.common.util.d.d("VideoMsgView::onContentClick open video failed.", new Object[0]);
                return;
            }
            if (TextUtils.isEmpty(path)) {
                path = k.f(IMClient.a().b(videoMessage.getMsgType()), k.c(url));
            }
            if (!k.f(path) && !TextUtils.isEmpty(url)) {
                IMClient.a().a(videoMessage, url, path, 5);
                return;
            }
            SessionParams c = com.sankuai.xm.imui.b.a().c();
            if (c != null) {
                Object[] objArr2 = {3};
                ChangeQuickRedirect changeQuickRedirect2 = SessionParams.a;
                if (PatchProxy.isSupport(objArr2, c, changeQuickRedirect2, false, "a47ca1bc1492faa00971a519fae06d85", 6917529027641081856L)) {
                    ((Boolean) PatchProxy.accessDispatch(objArr2, c, changeQuickRedirect2, false, "a47ca1bc1492faa00971a519fae06d85")).booleanValue();
                } else if (c.n != null && c.n.length != 0) {
                    Arrays.binarySearch(c.n, 3);
                }
                Object[] objArr3 = {3};
                ChangeQuickRedirect changeQuickRedirect3 = SessionParams.a;
                if (PatchProxy.isSupport(objArr3, c, changeQuickRedirect3, false, "e7db89ec1bc3aa129a49b785b49cad6d", 6917529027641081856L)) {
                    str = (String) PatchProxy.accessDispatch(objArr3, c, changeQuickRedirect3, false, "e7db89ec1bc3aa129a49b785b49cad6d");
                } else {
                    String str2 = Environment.DIRECTORY_PICTURES;
                    String string = c.u.getString("__xm_sdk_path_save_dir");
                    if (!ac.a(string)) {
                        if (!string.endsWith(k.d)) {
                            string = string + k.d;
                        }
                        str = string + "videos/";
                    } else {
                        str = k.a(str2, "DaXiang_Chat/").getAbsoluteFile().getAbsolutePath();
                        if (!str.endsWith(k.d)) {
                            str = str + k.d;
                        }
                    }
                }
            } else {
                str = null;
            }
            f a2 = f.a();
            Context context = getContext();
            Object[] objArr4 = {context, path, "", (byte) 0, str, null};
            ChangeQuickRedirect changeQuickRedirect4 = f.a;
            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "d077c8b96ffa3ba491993d526aa97a50", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "d077c8b96ffa3ba491993d526aa97a50");
                return;
            }
            a2.c = null;
            Intent intent = new Intent(context, PlayVideoActivity.class);
            intent.setPackage(context.getPackageName());
            intent.putExtra(QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH, path);
            intent.putExtra("msg", "");
            intent.putExtra("video_save_enable", false);
            intent.putExtra("video_save_dir", str);
            if (ActivityUtils.a(context, intent)) {
                ActivityUtils.b(context, intent);
            }
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(com.sankuai.xm.imui.session.entity.b<VideoMessage> bVar) {
        String sb;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f105c9abd75cde7cd3040bbc4f22247", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f105c9abd75cde7cd3040bbc4f22247");
            return;
        }
        super.a(bVar);
        VideoMessage videoMessage = bVar.b;
        Object[] objArr2 = {videoMessage};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2488745c9c9a4f799d05d8ce7c16290b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2488745c9c9a4f799d05d8ce7c16290b");
        } else {
            int width = videoMessage.getWidth();
            int height = videoMessage.getHeight();
            String screenshotUrl = videoMessage.getScreenshotUrl();
            if (width == 0 || height == 0) {
                int b = n.b(screenshotUrl);
                int c = n.c(screenshotUrl);
                width = com.sankuai.xm.imui.common.util.k.a(getContext(), b);
                height = com.sankuai.xm.imui.common.util.k.a(getContext(), c);
            }
            com.sankuai.xm.imui.common.util.d.b("VideoMsgView::resize:: %s %s", Integer.valueOf(width), Integer.valueOf(height));
            int[] a2 = n.a(width, height, 1, getResources().getDimensionPixelSize(R.dimen.xm_sdk_image_msg_max_size), getResources().getDimensionPixelSize(R.dimen.xm_sdk_image_msg_min_size));
            this.t.a(a2[0], a2[1]);
            this.l.invalidate();
            this.l.requestLayout();
        }
        TextView textView = this.u;
        int duration = bVar.b.getDuration();
        Object[] objArr3 = {Integer.valueOf(duration)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "78991f311405804fb8845a835df26af9", 6917529027641081856L)) {
            sb = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "78991f311405804fb8845a835df26af9");
        } else {
            StringBuilder sb2 = new StringBuilder();
            int i = (duration / 1000) + (duration % 1000 <= 0 ? 0 : 1);
            int i2 = i % 60;
            sb2.append(i2);
            if (i2 < 10) {
                sb2.insert(0, "0");
            }
            if (i >= 60) {
                int i3 = i / 60;
                int i4 = i3 % 60;
                sb2.insert(0, i4 + CommonConstant.Symbol.COLON);
                if (i4 < 10) {
                    sb2.insert(0, "0");
                }
                if (i3 >= 60) {
                    sb2.insert(0, (i3 / 60) + CommonConstant.Symbol.COLON);
                }
            } else {
                sb2.insert(0, "00:");
            }
            sb = sb2.toString();
        }
        textView.setText(sb);
        if (a()) {
            b();
        } else {
            c();
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61261efd6a31e7c0d9a2575629dd8b3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61261efd6a31e7c0d9a2575629dd8b3a");
            return;
        }
        super.a(i);
        c();
    }

    @Override // com.sankuai.xm.imui.session.view.MediaMsgView
    public final void a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79fed6332f2b1819d89f362262bff438", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79fed6332f2b1819d89f362262bff438");
            return;
        }
        super.a(str, i, i2);
        if (i != 12) {
            switch (i) {
                case 7:
                    if (str.equals(((VideoMessage) this.n.b).getScreenshotUrl())) {
                        b();
                        return;
                    }
                    return;
                case 8:
                    if (!str.equals(((VideoMessage) this.n.b).getScreenshotUrl())) {
                        return;
                    }
                    break;
                default:
                    return;
            }
        }
        c();
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "352ea7f073b3c398fca7a9108feb1418", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "352ea7f073b3c398fca7a9108feb1418")).booleanValue();
        }
        Bundle bundle = this.n.o;
        StringBuilder sb = new StringBuilder("xm_sdk_");
        sb.append(((VideoMessage) this.n.b).getScreenshotUrl());
        return bundle.getInt(sb.toString(), -1) == 7;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6244942847c95a27137905df20188d51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6244942847c95a27137905df20188d51");
            return;
        }
        this.t.a(R.drawable.xm_sdk_ic_video_failed, com.sankuai.xm.imui.common.util.k.a(getContext(), 24.0f), com.sankuai.xm.imui.common.util.k.a(getContext(), 42.0f));
    }

    @Override // com.sankuai.xm.imui.session.view.MediaMsgView
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0cdbd7353b41b2a042c183768b6fd9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0cdbd7353b41b2a042c183768b6fd9e");
            return;
        }
        super.b(i);
        if (i >= 0 && i < 100 && ((VideoMessage) this.n.b).getFileStatus() == 6) {
            this.v.setVisibility(0);
            this.v.setProgress(i);
            this.w.setVisibility(8);
            this.u.setVisibility(8);
            return;
        }
        this.v.setVisibility(8);
        this.v.setProgress(0);
        this.w.setVisibility(0);
        this.u.setVisibility(0);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40df20cb9711432f7263feb4db331988", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40df20cb9711432f7263feb4db331988");
            return;
        }
        VideoMessage videoMessage = (VideoMessage) this.n.b;
        String a2 = w.a(videoMessage);
        String screenshotUrl = videoMessage.getScreenshotUrl();
        if (k.o(a2) || TextUtils.isEmpty(screenshotUrl)) {
            l.a(0, this.w);
            this.t.setImageResource(com.sankuai.xm.integration.imageloader.utils.a.a(a2));
            return;
        }
        l.a(8, this.w);
        Bundle bundle = this.n.o;
        bundle.remove("xm_sdk_" + screenshotUrl);
        IMClient.a().a(videoMessage, screenshotUrl, a2, 2);
        int a3 = com.sankuai.xm.imui.common.util.k.a(getContext(), 20.0f);
        this.t.a(R.drawable.xm_sdk_progress_loading, a3, a3);
    }
}
