package com.sankuai.titans.widget.media.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.PlayerBuilder;
import com.sankuai.titans.widget.media.MediaActivity;
import com.sankuai.titans.widget.media.adapter.PhotoPagerAdapter;
import com.sankuai.titans.widget.media.fragment.PicassoCompat;
import com.sankuai.titans.widget.media.utils.MediaStoreHelper;
import com.sankuai.waimai.platform.utils.f;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MediaPlayerFragment extends Fragment {
    private static final String KEY_ACTIVITY_NEW_INSTANCE = "KEY_ACTIVITY_NEW_INSTANCE";
    private static final String KEY_GLOBAL_URL_HEADER = "KEY_GLOBAL_URL_HEADER";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ArrayList<String> assets;
    private ArrayList<Integer> assetsColor;
    private int currentItem;
    private String hintContent;
    private OnPageChangeListener mOnPageChangeListener;
    private PhotoPagerAdapter mPagerAdapter;
    private ViewPager mViewPager;
    private boolean showIndicateView;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnPageChangeListener {
        void onPageChanged(int i, int i2);
    }

    public MediaPlayerFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc2251edeef863c34594e5d1efc46c74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc2251edeef863c34594e5d1efc46c74");
            return;
        }
        this.currentItem = 0;
        this.showIndicateView = false;
    }

    public static MediaPlayerFragment pickNewInstance(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8819bc557000c557c5e31d44676e11b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (MediaPlayerFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8819bc557000c557c5e31d44676e11b3");
        }
        MediaPlayerFragment mediaPlayerFragment = new MediaPlayerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(PlayerBuilder.KEY_FIRST_ASSET_INDEX, i);
        bundle.putBoolean(KEY_ACTIVITY_NEW_INSTANCE, false);
        mediaPlayerFragment.setArguments(bundle);
        return mediaPlayerFragment;
    }

    public static MediaPlayerFragment activityNewInstance(Bundle bundle, HashMap<String, HashMap<String, String>> hashMap) {
        Object[] objArr = {bundle, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "802dddda806657c59d7ec3fedfaca368", RobustBitConfig.DEFAULT_VALUE)) {
            return (MediaPlayerFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "802dddda806657c59d7ec3fedfaca368");
        }
        MediaPlayerFragment mediaPlayerFragment = new MediaPlayerFragment();
        if (bundle != null) {
            bundle.putSerializable(KEY_GLOBAL_URL_HEADER, hashMap);
            bundle.putBoolean(KEY_ACTIVITY_NEW_INSTANCE, true);
            mediaPlayerFragment.setArguments(bundle);
        }
        return mediaPlayerFragment;
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09333713dac31ae458b3ad5db1b7f8a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09333713dac31ae458b3ad5db1b7f8a2");
            return;
        }
        super.onResume();
        if (getActivity() instanceof MediaActivity) {
            ((MediaActivity) getActivity()).updateTitleDoneItem();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd5a852609e5abc50f9117cddc17a63f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd5a852609e5abc50f9117cddc17a63f");
            return;
        }
        super.onCreate(bundle);
        this.assets = new ArrayList<>();
        this.assetsColor = new ArrayList<>();
        Bundle arguments = getArguments();
        this.mPagerAdapter = new PhotoPagerAdapter(this, getFitPicasso(), this.assets, this.assetsColor);
        if (arguments != null) {
            if (arguments.getBoolean(KEY_ACTIVITY_NEW_INSTANCE)) {
                ArrayList<String> stringArrayList = arguments.getStringArrayList(PlayerBuilder.KEY_ASSETS);
                if (stringArrayList != null) {
                    this.assets.addAll(stringArrayList);
                }
            } else {
                this.assets.addAll(MediaStoreHelper.getPhotoPaths());
            }
            this.currentItem = arguments.getInt(PlayerBuilder.KEY_FIRST_ASSET_INDEX, this.currentItem);
            this.showIndicateView = arguments.getBoolean(PlayerBuilder.KEY_SHOW_INDICATE, this.showIndicateView);
            this.hintContent = arguments.getString(PlayerBuilder.KEY_HINT_CONTENT);
            this.mPagerAdapter.globalHeads = (HashMap) f.a(arguments, KEY_GLOBAL_URL_HEADER);
            this.mPagerAdapter.autoPlay = arguments.getBoolean(PlayerBuilder.KEY_AUTO_PLAY, this.mPagerAdapter.autoPlay);
            this.mPagerAdapter.autoSound = arguments.getBoolean(PlayerBuilder.KEY_AUTO_SOUND, this.mPagerAdapter.autoSound);
            this.mPagerAdapter.onlyVideo = arguments.getBoolean(PlayerBuilder.KEY_ONLY_VIDEO, this.mPagerAdapter.onlyVideo);
            this.mPagerAdapter.showDownload = arguments.getBoolean(PlayerBuilder.KEY_SHOW_DOWNLOAD, this.mPagerAdapter.showDownload);
            this.mPagerAdapter.accessToken = arguments.getString(MediaActivity.KEY_ACCESS_TOKEN, this.mPagerAdapter.accessToken);
            ArrayList<Integer> integerArrayList = arguments.getIntegerArrayList(PlayerBuilder.KEY_ASSETS_COLOR);
            if (integerArrayList != null) {
                this.assetsColor.addAll(integerArrayList);
            }
        }
    }

    private Picasso getFitPicasso() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58c2bb5699cd84810b88e9a11ee111f2", RobustBitConfig.DEFAULT_VALUE) ? (Picasso) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58c2bb5699cd84810b88e9a11ee111f2") : new PicassoCompat.PicassoCompatBuilder(getContext()).registerHeaderHunter(new PicassoCompat.IPicassoCompatHeaderHunter() { // from class: com.sankuai.titans.widget.media.fragment.MediaPlayerFragment.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.widget.media.fragment.PicassoCompat.IPicassoCompatHeaderHunter
            public HashMap<String, String> getHeaders(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fe29429885f9dec0daf0e845a9936858", RobustBitConfig.DEFAULT_VALUE)) {
                    return (HashMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fe29429885f9dec0daf0e845a9936858");
                }
                if (MediaPlayerFragment.this.mPagerAdapter == null || MediaPlayerFragment.this.mPagerAdapter.globalHeads == null) {
                    return null;
                }
                return MediaPlayerFragment.this.mPagerAdapter.globalHeads.get(str);
            }
        }).build();
    }

    private void initHintView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c3ccd8c2832b34cd624e826c5d5379b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c3ccd8c2832b34cd624e826c5d5379b");
        } else if (view == null) {
        } else {
            final TextView textView = (TextView) view.findViewById(R.id.vp_hint);
            if (!TextUtils.isEmpty(this.hintContent)) {
                textView.setVisibility(0);
                textView.setText(this.hintContent);
                textView.postDelayed(new Runnable() { // from class: com.sankuai.titans.widget.media.fragment.MediaPlayerFragment.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "57bc5e6aa864c51f6af56777da630883", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "57bc5e6aa864c51f6af56777da630883");
                        } else {
                            textView.setVisibility(8);
                        }
                    }
                }, Math.max(3000, (this.hintContent.length() * 1000) / 5));
                return;
            }
            textView.setVisibility(8);
        }
    }

    private void initIndicateView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "add19176dbf4329f87c36bae46221e6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "add19176dbf4329f87c36bae46221e6b");
        } else if (view == null) {
        } else {
            final TextView textView = (TextView) view.findViewById(R.id.vp_indicate);
            if (this.showIndicateView) {
                textView.setVisibility(0);
                textView.setText((this.mViewPager.getCurrentItem() + 1) + "/" + this.assets.size());
                this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.titans.widget.media.fragment.MediaPlayerFragment.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                    public void onPageScrollStateChanged(int i) {
                    }

                    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                    public void onPageScrolled(int i, float f, int i2) {
                    }

                    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                    public void onPageSelected(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1abf797ebec99497b564ef9f78557ac6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1abf797ebec99497b564ef9f78557ac6");
                        } else if (textView != null) {
                            TextView textView2 = textView;
                            textView2.setText((i + 1) + "/" + MediaPlayerFragment.this.assets.size());
                        }
                    }
                });
                return;
            }
            textView.setVisibility(8);
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c531f53cfa8341f9adf62a2b20978fd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c531f53cfa8341f9adf62a2b20978fd7");
        }
        View inflate = layoutInflater.inflate(R.layout.titans_picker_picker_fragment_image_pager, viewGroup, false);
        this.mViewPager = (ViewPager) inflate.findViewById(R.id.vp_photos);
        initIndicateView(inflate);
        initHintView(inflate);
        this.mViewPager.setAdapter(this.mPagerAdapter);
        this.mViewPager.addOnPageChangeListener(this.mPagerAdapter);
        this.mViewPager.setCurrentItem(this.currentItem);
        this.mViewPager.setOffscreenPageLimit(1);
        this.mViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.sankuai.titans.widget.media.fragment.MediaPlayerFragment.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "917d96ba06540e597bf231a4525371fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "917d96ba06540e597bf231a4525371fc");
                    return;
                }
                super.onPageScrolled(i, f, i2);
                if (MediaPlayerFragment.this.mOnPageChangeListener != null) {
                    MediaPlayerFragment.this.mOnPageChangeListener.onPageChanged(MediaPlayerFragment.this.mViewPager.getCurrentItem(), MediaPlayerFragment.this.assets.size());
                }
            }
        });
        this.mViewPager.getAdapter().notifyDataSetChanged();
        return inflate;
    }

    public ArrayList<String> getCurrentPath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da2f33b4bf4fae879c945cdd2b94cf24", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da2f33b4bf4fae879c945cdd2b94cf24");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        int currentItem = this.mViewPager.getCurrentItem();
        if (this.assets != null && this.assets.size() > currentItem) {
            arrayList.add(this.assets.get(currentItem));
        }
        return arrayList;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5801a69c431e64b47c2a4079ea82efc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5801a69c431e64b47c2a4079ea82efc3");
            return;
        }
        super.onDestroy();
        this.assets.clear();
        this.assets = null;
        MediaStoreHelper.clearPhotoPaths();
        if (this.mViewPager != null) {
            this.mViewPager.setAdapter(null);
        }
    }
}
