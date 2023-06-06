package com.sankuai.titans.widget.media.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bumptech.glide.i;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.titans.widget.SnackbarUtil;
import com.sankuai.titans.widget.media.fragment.PicassoCompat;
import com.sankuai.titans.widget.media.utils.AndroidLifecycleUtils;
import com.sankuai.titans.widget.media.utils.MediaStoreHelper;
import com.sankuai.titans.widget.media.widget.TitansSystemVideoView;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PhotoPagerAdapter extends PagerAdapter implements ViewPager.OnPageChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String accessToken;
    public boolean autoPlay;
    public boolean autoSound;
    private PageItem curPageItem;
    private DownloadImageData downloadImageData;
    private Fragment fragment;
    public HashMap<String, HashMap<String, String>> globalHeads;
    private Picasso mPicasso;
    public boolean onlyVideo;
    private List<String> paths;
    private List<Integer> pathsColor;
    public boolean showDownload;

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    public PhotoPagerAdapter(Fragment fragment, Picasso picasso, List<String> list, List<Integer> list2) {
        Object[] objArr = {fragment, picasso, list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "241653a24ddd13811454f2e62def0881", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "241653a24ddd13811454f2e62def0881");
            return;
        }
        this.autoSound = false;
        this.autoPlay = true;
        this.onlyVideo = false;
        this.showDownload = true;
        this.fragment = fragment;
        this.paths = list;
        this.mPicasso = picasso;
        this.curPageItem = new PageItem();
        this.pathsColor = list2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View videoView;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "102523fc2f2a9eb1bbc3714b469fae9d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "102523fc2f2a9eb1bbc3714b469fae9d");
        }
        Context context = viewGroup.getContext();
        String str = this.paths.get(i);
        if (this.onlyVideo || str.toLowerCase().endsWith(".mp4") || str.contains("type=video")) {
            videoView = getVideoView(viewGroup, context, str);
        } else {
            videoView = getImageView(viewGroup, context, str);
        }
        if (this.pathsColor != null && this.pathsColor.size() > i) {
            videoView.setBackgroundColor(this.pathsColor.get(i).intValue());
        }
        return videoView;
    }

    private View getVideoView(ViewGroup viewGroup, Context context, String str) {
        Object[] objArr = {viewGroup, context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e64084006ea515ee10675917d1998f33", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e64084006ea515ee10675917d1998f33");
        }
        TitansSystemVideoView titansSystemVideoView = new TitansSystemVideoView(context);
        TitansSystemVideoView.VideoParam videoParam = new TitansSystemVideoView.VideoParam();
        videoParam.autoSound = this.autoSound;
        videoParam.autoPlay = this.autoPlay;
        videoParam.path = str;
        titansSystemVideoView.setVideoParam(videoParam);
        viewGroup.addView(titansSystemVideoView, -1, -1);
        titansSystemVideoView.setTag(titansSystemVideoView);
        return titansSystemVideoView;
    }

    private View getImageView(ViewGroup viewGroup, final Context context, final String str) {
        final Uri fromFile;
        Object[] objArr = {viewGroup, context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d76563a597d27ff90f6f8793edad2094", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d76563a597d27ff90f6f8793edad2094");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.titans_picker_picker_item_pager, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_pager);
        final View findViewById = inflate.findViewById(R.id.titans_preview_pic_download);
        findViewById.setVisibility(8);
        final boolean z = this.showDownload && str.startsWith("http");
        if (z) {
            fromFile = Uri.parse(str);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.widget.media.adapter.PhotoPagerAdapter.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "56559a39d20c36e1b80a63dfac7574dc", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "56559a39d20c36e1b80a63dfac7574dc");
                        return;
                    }
                    PhotoPagerAdapter.this.downloadImageData = new DownloadImageData();
                    PhotoPagerAdapter.this.downloadImageData.path = str;
                    PhotoPagerAdapter.this.downloadImageData.headers = PhotoPagerAdapter.this.globalHeads != null ? PhotoPagerAdapter.this.globalHeads.get(fromFile.toString()) : null;
                    TitansPermissionUtil.requestPermission(PhotoPagerAdapter.this.fragment.getActivity(), PermissionGuard.PERMISSION_STORAGE, PhotoPagerAdapter.this.accessToken, new IRequestPermissionCallback() { // from class: com.sankuai.titans.widget.media.adapter.PhotoPagerAdapter.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.sankuai.titans.result.IRequestPermissionCallback
                        public void onResult(boolean z2, int i) {
                            Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "82686785990dff0b60057bdf480c3f2d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "82686785990dff0b60057bdf480c3f2d");
                            } else if (!z2) {
                                SnackbarUtil.showSnackbar(PhotoPagerAdapter.this.fragment.getActivity(), "请开启存储权限");
                            } else {
                                PhotoPagerAdapter.this.onGetStorageWritePermission();
                            }
                        }
                    });
                }
            });
        } else if (str.contains("://")) {
            fromFile = Uri.parse(str);
        } else {
            fromFile = Uri.fromFile(new File(str));
        }
        Uri uri = fromFile;
        boolean canLoadImage = AndroidLifecycleUtils.canLoadImage(context);
        final View findViewById2 = inflate.findViewById(R.id.titans_preview_loading);
        PicassoCompat.LoadCallback loadCallback = new PicassoCompat.LoadCallback() { // from class: com.sankuai.titans.widget.media.adapter.PhotoPagerAdapter.2
            public static ChangeQuickRedirect changeQuickRedirect;
            public Animation videoLoadingAnimation;

            {
                this.videoLoadingAnimation = AnimationUtils.loadAnimation(context, R.anim.titans_preview_video_loading);
            }

            @Override // com.sankuai.titans.widget.media.fragment.PicassoCompat.LoadCallback
            public void onSuccess() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c674ab62269fe80a2efd4d72123ad524", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c674ab62269fe80a2efd4d72123ad524");
                    return;
                }
                findViewById2.clearAnimation();
                findViewById2.setVisibility(8);
                if (z) {
                    findViewById.setVisibility(0);
                }
            }

            @Override // com.sankuai.titans.widget.media.fragment.PicassoCompat.LoadCallback
            public void onFail() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5028f384303996af0212d10170bb2ee5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5028f384303996af0212d10170bb2ee5");
                    return;
                }
                findViewById2.setActivated(false);
                findViewById2.clearAnimation();
            }

            @Override // com.sankuai.titans.widget.media.fragment.PicassoCompat.LoadCallback
            public void onLoad() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2b6d13dd329974f3cf77c9166c9ec7b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2b6d13dd329974f3cf77c9166c9ec7b8");
                    return;
                }
                findViewById2.setVisibility(0);
                findViewById2.setActivated(true);
                findViewById2.startAnimation(this.videoLoadingAnimation);
            }
        };
        if (canLoadImage) {
            PicassoCompat.load(this.mPicasso, uri, imageView, loadCallback, this.globalHeads != null ? this.globalHeads.get(uri.toString()) : null);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.widget.media.adapter.PhotoPagerAdapter.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "55d20ca78d3a6344814a1c5f6cee73a2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "55d20ca78d3a6344814a1c5f6cee73a2");
                } else if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
                } else {
                    ((Activity) context).onBackPressed();
                }
            }
        });
        viewGroup.addView(inflate);
        inflate.setTag(imageView);
        return inflate;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8710d944c317a07bcc7e8eebb230e7c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8710d944c317a07bcc7e8eebb230e7c")).intValue() : this.paths.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03fcf3dc18c99dfb1b5efe74b5a77db1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03fcf3dc18c99dfb1b5efe74b5a77db1");
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        if (this.curPageItem.position != i && obj != null && (obj instanceof View)) {
            View view = (View) obj;
            if (view.getTag() instanceof TitansSystemVideoView) {
                ((TitansSystemVideoView) view.getTag()).onShow();
            }
        }
        this.curPageItem.position = i;
        this.curPageItem.view = obj instanceof View ? (View) obj : null;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fe406792a019356efb8fd6e3ff08b86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fe406792a019356efb8fd6e3ff08b86");
            return;
        }
        View view = (View) obj;
        viewGroup.removeView(view);
        if (view.getTag() instanceof ImageView) {
            ImageView imageView = (ImageView) view.getTag();
            if (imageView.getTag() != null) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = i < this.paths.size() ? this.paths.get(i) : "";
                objArr2[1] = String.valueOf(imageView.getTag());
                Log.e("Titans-Widget", String.format("maybe crash!!! imageView url=%s,tag=%s", objArr2));
            }
            i.a(imageView);
        } else if (view.getTag() instanceof TitansSystemVideoView) {
            ((TitansSystemVideoView) view.getTag()).onDestroy();
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a400d24362809fe59e3f8731af746396", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a400d24362809fe59e3f8731af746396");
        } else if (this.curPageItem.view == null || !(this.curPageItem.view.getTag() instanceof TitansSystemVideoView)) {
        } else {
            ((TitansSystemVideoView) this.curPageItem.view.getTag()).onHide();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.titans.widget.media.adapter.PhotoPagerAdapter$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 implements MediaStoreHelper.SaveImageCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AnonymousClass4() {
        }

        @Override // com.sankuai.titans.widget.media.utils.MediaStoreHelper.SaveImageCallback
        public Context getContext() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45c1b772d30dafaeec1d3cc957b3ea99", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45c1b772d30dafaeec1d3cc957b3ea99") : PhotoPagerAdapter.this.fragment.getContext();
        }

        @Override // com.sankuai.titans.widget.media.utils.MediaStoreHelper.SaveImageCallback
        public void onSuccess(String str, final Uri uri) {
            Object[] objArr = {str, uri};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72fb124c892bd3c1acddc432f0a540b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72fb124c892bd3c1acddc432f0a540b8");
            } else if (PhotoPagerAdapter.this.fragment.getView() != null) {
                PhotoPagerAdapter.this.fragment.getView().post(new Runnable() { // from class: com.sankuai.titans.widget.media.adapter.PhotoPagerAdapter.4.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "561f015a43d377e79c285c77cd905986", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "561f015a43d377e79c285c77cd905986");
                        } else if (PhotoPagerAdapter.this.fragment.getActivity() != null) {
                            FragmentActivity activity = PhotoPagerAdapter.this.fragment.getActivity();
                            SnackbarUtil.showSnackbar(activity, "图片已保存到" + uri.getPath());
                            b.a(AnonymousClass4.this.getContext(), new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                        }
                    }
                });
            }
        }

        @Override // com.sankuai.titans.widget.media.utils.MediaStoreHelper.SaveImageCallback
        public void onFaild(String str, final String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43d074c0461b01f8aab653250c1a106e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43d074c0461b01f8aab653250c1a106e");
            } else if (PhotoPagerAdapter.this.fragment.getView() != null) {
                PhotoPagerAdapter.this.fragment.getView().post(new Runnable() { // from class: com.sankuai.titans.widget.media.adapter.PhotoPagerAdapter.4.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1b4af8c68836bd2026e740025bcb4743", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1b4af8c68836bd2026e740025bcb4743");
                        } else if (PhotoPagerAdapter.this.fragment.getActivity() != null) {
                            SnackbarUtil.showSnackbar(PhotoPagerAdapter.this.fragment.getActivity(), str2);
                        }
                    }
                });
            }
        }
    }

    public void onGetStorageWritePermission() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75dc1f7b7cad7b5442aeda042487f492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75dc1f7b7cad7b5442aeda042487f492");
        } else if (this.downloadImageData == null) {
        } else {
            PicassoCompat.downloadImage(this.mPicasso, this.downloadImageData.path, this.downloadImageData.headers, this.accessToken, new AnonymousClass4());
            this.downloadImageData = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class DownloadImageData {
        public static ChangeQuickRedirect changeQuickRedirect;
        public HashMap<String, String> headers;
        public String path;

        public DownloadImageData() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class PageItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int position = -1;
        public View view;

        public PageItem() {
        }
    }
}
