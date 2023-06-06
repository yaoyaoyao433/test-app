package com.sankuai.waimai.business.restaurant.poicontainer.comment.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.domain.core.comment.Picture;
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.platform.utils.n;
import com.sankuai.waimai.platform.widget.roundview.RoundedImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CommentImageGallery extends FrameLayout {
    public static ChangeQuickRedirect a;
    private Comment b;
    private int c;
    private float d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private a i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(Comment comment, ArrayList<Picture> arrayList, ArrayList<e> arrayList2, int i, boolean z);
    }

    public CommentImageGallery(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f09bd5f0f211514480caa0f1f64c107c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f09bd5f0f211514480caa0f1f64c107c");
            return;
        }
        this.e = 9;
        this.g = 9;
        this.h = false;
    }

    public CommentImageGallery(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3d9ce8510b948407cf737b48299e840", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3d9ce8510b948407cf737b48299e840");
            return;
        }
        this.e = 9;
        this.g = 9;
        this.h = false;
    }

    public CommentImageGallery(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "085beb0eeab2f0bbb2e2cee9ecaedbe6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "085beb0eeab2f0bbb2e2cee9ecaedbe6");
            return;
        }
        this.e = 9;
        this.g = 9;
        this.h = false;
    }

    public CommentImageGallery(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d17c55cad38b4f4e06b9741686161f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d17c55cad38b4f4e06b9741686161f");
            return;
        }
        this.e = 9;
        this.g = 9;
        this.h = false;
    }

    public void setPadding(int i) {
        this.c = i;
    }

    public void setImageCornerRadius(float f) {
        this.d = f;
    }

    public void setPictures(Comment comment) {
        Object[] objArr = {comment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8cf219bbd01c2c741b9517e9998bacc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8cf219bbd01c2c741b9517e9998bacc");
        } else if (comment != null) {
            if (b.b(comment.commentPics) && comment.commentVideo == null) {
                return;
            }
            this.b = comment;
            if (this.b.commentPics == null) {
                this.b.commentPics = new ArrayList<>();
            }
            if (this.b.commentVideo != null) {
                this.e = 10;
                this.g = 3;
                this.h = true;
                if (this.b.commentPics.size() == 0 || !this.b.commentPics.get(0).isVideo()) {
                    Picture picture = new Picture();
                    picture.setWmUrlWithQuality(ImageQualityUtil.b(com.meituan.android.singleton.b.a, comment.commentVideo.c, 0, g.a(com.meituan.android.singleton.b.a)));
                    picture.setWmThumbUrlWithQuality(ImageQualityUtil.b(com.meituan.android.singleton.b.a, comment.commentVideo.c, 0, g.a(com.meituan.android.singleton.b.a, 80.0f)));
                    picture.setIsVideo(true);
                    picture.setCommentVideo(comment.commentVideo);
                    this.b.commentPics.add(0, picture);
                }
            } else {
                this.e = 9;
                this.g = this.e;
                this.h = false;
            }
            if (this.e < this.b.commentPics.size()) {
                this.b.commentPics = new ArrayList<>(this.b.commentPics.subList(0, this.e));
            }
            List<Picture> subList = this.g < this.b.commentPics.size() ? this.b.commentPics.subList(0, this.g) : this.b.commentPics;
            this.f = this.b.commentPics.size();
            a(subList);
            requestLayout();
        }
    }

    public void setImageClickListener(a aVar) {
        this.i = aVar;
    }

    private void a(@NonNull List<Picture> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15fef8aa896e8bb039178a6f32edf1ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15fef8aa896e8bb039178a6f32edf1ee");
            return;
        }
        removeAllViews();
        final int i = 0;
        while (i < list.size()) {
            Picture picture = list.get(i);
            String fullSizeUrl = (i == 0 || i == 1) ? picture.getFullSizeUrl(getContext()) : picture.getThumbUrl(getContext());
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.wm_restaurant_comment_gallery_item_layout, (ViewGroup) this, false);
            inflate.findViewById(R.id.iv_comment_video_icon).setVisibility(picture.getCommentVideo() != null ? 0 : 4);
            View findViewById = inflate.findViewById(R.id.tv_pic_count_lly);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_pic_count);
            if (this.h && i + 1 == this.g && this.f > this.g) {
                textView.setText(String.valueOf(this.f));
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
            RoundedImageView roundedImageView = (RoundedImageView) inflate.findViewById(R.id.iv_comment_pic);
            StringBuilder sb = new StringBuilder("评价图片");
            int i2 = i + 1;
            sb.append(i2);
            roundedImageView.setContentDescription(sb.toString());
            roundedImageView.setCornerRadius(this.d);
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.b = getContext();
            c.j = R.drawable.wm_common_good_img_default;
            c.i = R.drawable.wm_common_good_img_default;
            c.e = 1;
            c.k = 4;
            c.l = true;
            c.c = fullSizeUrl;
            c.a((ImageView) roundedImageView);
            roundedImageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.widget.CommentImageGallery.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98f8410f10aafab6725832242a7c8777", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98f8410f10aafab6725832242a7c8777");
                    } else if (CommentImageGallery.this.i != null) {
                        try {
                            n.a().a(CommentImageGallery.this.b);
                            CommentImageGallery.this.i.a(CommentImageGallery.this.b, CommentImageGallery.this.b.commentPics, CommentImageGallery.this.getMediaInfoList(), i, CommentImageGallery.this.h);
                        } catch (Exception e) {
                            com.sankuai.waimai.foundation.utils.log.a.e("CommentImageGallery-onClick", e.getMessage(), new Object[0]);
                        }
                    }
                }
            });
            addView(inflate);
            i = i2;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f029220f337472ef8d67dca49e05db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f029220f337472ef8d67dca49e05db");
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            if (childCount == 1) {
                size2 = (((size - (this.c * 2)) / 3) * 2) + this.c;
                measureChild(getChildAt(0), View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childCount == 2) {
                int i5 = (size - this.c) / 2;
                while (i4 < childCount) {
                    measureChild(getChildAt(i4), View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                    i4++;
                }
                size2 = i5;
            } else {
                if (childCount == 3) {
                    int i6 = (size - (this.c * 2)) / 3;
                    i3 = (i6 * 2) + this.c;
                    measureChild(getChildAt(0), View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                    measureChild(getChildAt(1), View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                    measureChild(getChildAt(2), View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                } else {
                    int i7 = (size - (this.c * 2)) / 3;
                    int i8 = ((childCount - 1) / 3) + 1;
                    i3 = (i7 * i8) + ((i8 - 1) * this.c);
                    while (i4 < childCount) {
                        measureChild(getChildAt(i4), View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                        i4++;
                    }
                }
                size2 = i3;
            }
        } else if (mode != 1073741824) {
            size2 = 0;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a914e1f204d30cd325e4cd9ef50f701f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a914e1f204d30cd325e4cd9ef50f701f");
            return;
        }
        int childCount = getChildCount();
        if (childCount == 1) {
            View childAt = getChildAt(0);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        } else if (childCount == 2) {
            View childAt2 = getChildAt(0);
            childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
            View childAt3 = getChildAt(1);
            childAt3.layout(childAt2.getMeasuredWidth() + this.c, 0, childAt2.getMeasuredWidth() + this.c + childAt3.getMeasuredWidth(), childAt3.getMeasuredHeight());
        } else if (childCount == 3) {
            View childAt4 = getChildAt(0);
            View childAt5 = getChildAt(1);
            View childAt6 = getChildAt(2);
            childAt4.layout(0, 0, childAt4.getMeasuredWidth(), childAt4.getMeasuredHeight());
            childAt5.layout(childAt4.getMeasuredWidth() + this.c, 0, childAt4.getMeasuredWidth() + this.c + childAt5.getMeasuredWidth(), childAt5.getMeasuredHeight());
            childAt6.layout(childAt4.getMeasuredWidth() + this.c, childAt5.getMeasuredHeight() + this.c, childAt4.getMeasuredWidth() + this.c + childAt6.getMeasuredWidth(), childAt5.getMeasuredHeight() + this.c + childAt6.getMeasuredHeight());
        } else {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt7 = getChildAt(i5);
                int measuredWidth = (i5 % 3) * (childAt7.getMeasuredWidth() + this.c);
                int measuredHeight = (i5 / 3) * (childAt7.getMeasuredHeight() + this.c);
                childAt7.layout(measuredWidth, measuredHeight, childAt7.getMeasuredWidth() + measuredWidth, childAt7.getMeasuredHeight() + measuredHeight);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<e> getMediaInfoList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe86890872001d83647f077cdbad66c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe86890872001d83647f077cdbad66c");
        }
        ArrayList<e> arrayList = new ArrayList<>();
        Iterator<Picture> it = this.b.commentPics.iterator();
        while (it.hasNext()) {
            Picture next = it.next();
            e eVar = new e();
            com.sankuai.waimai.platform.domain.core.comment.a commentVideo = next.getCommentVideo();
            if (commentVideo != null) {
                eVar.b = 1;
                eVar.c = commentVideo.b;
                eVar.d = commentVideo.c;
                eVar.g = commentVideo.d;
                eVar.h = commentVideo.e;
                eVar.e = (int) (next.getCommentVideo().f / 1000);
            } else {
                eVar.b = 0;
                eVar.c = next.getFullSizeUrl(getContext());
            }
            arrayList.add(eVar);
        }
        return arrayList;
    }
}
