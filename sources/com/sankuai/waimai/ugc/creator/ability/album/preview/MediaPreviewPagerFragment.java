package com.sankuai.waimai.ugc.creator.ability.album.preview;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import com.sankuai.waimai.ugc.creator.ability.album.utils.b;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.widgets.AnimationView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.PicassoDrawableTarget;
import com.squareup.picasso.RequestCreator;
import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MediaPreviewPagerFragment extends Fragment {
    public static ChangeQuickRedirect a;
    private Picasso b;
    private b c;
    private Dialog d;

    public MediaPreviewPagerFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2a4c4455f05525f4ce2641f42de91a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2a4c4455f05525f4ce2641f42de91a3");
        } else {
            this.d = null;
        }
    }

    public static MediaPreviewPagerFragment a(ImageData imageData) {
        Object[] objArr = {imageData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ace1ed9869c6cfff013af94dbb952a99", RobustBitConfig.DEFAULT_VALUE)) {
            return (MediaPreviewPagerFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ace1ed9869c6cfff013af94dbb952a99");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(WmChooseMediaModule.PREVIEW_MEDIA, imageData);
        MediaPreviewPagerFragment mediaPreviewPagerFragment = new MediaPreviewPagerFragment();
        mediaPreviewPagerFragment.setArguments(bundle);
        return mediaPreviewPagerFragment;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2acaf3471b2d1cfe577b1973080aee4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2acaf3471b2d1cfe577b1973080aee4a");
            return;
        }
        super.onCreate(bundle);
        this.c = new b(getContext(), "ugccreator_ugc_icon_mediapicker_image_default");
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48735b58aad9a9e47526bd540614abd4", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48735b58aad9a9e47526bd540614abd4") : layoutInflater.inflate(R.layout.wm_ugc_media_album_preview_item_pager, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9e7a104cca59415f4149ffd5750391f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9e7a104cca59415f4149ffd5750391f");
            return;
        }
        this.b = Picasso.g(getContext());
        final PhotoView photoView = (PhotoView) view.findViewById(R.id.iv_pager);
        final AnimationView animationView = (AnimationView) view.findViewById(R.id.loading_view);
        RequestCreator d = this.b.d(((ImageData) getArguments().getParcelable(WmChooseMediaModule.PREVIEW_MEDIA)).h);
        d.n = this;
        d.i = this.c.a(getContext(), "ugccreator_ugc_icon_mediapicker_image_default");
        d.a(new PicassoDrawableTarget() { // from class: com.sankuai.waimai.ugc.creator.ability.album.preview.MediaPreviewPagerFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.squareup.picasso.PicassoDrawableTarget
            public final void onLoadFailed(Exception exc, Drawable drawable) {
                Object[] objArr2 = {exc, drawable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e28de97c8b88164dc63e5b5cfe871b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e28de97c8b88164dc63e5b5cfe871b4");
                    return;
                }
                super.onLoadFailed(exc, drawable);
                animationView.setVisibility(8);
            }

            @Override // com.squareup.picasso.PicassoDrawableTarget
            public final void onResourceReady(PicassoDrawable picassoDrawable, Picasso.LoadedFrom loadedFrom) {
                Object[] objArr2 = {picassoDrawable, loadedFrom};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ce45b7d38a8b51b4e4c1bbac29070da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ce45b7d38a8b51b4e4c1bbac29070da");
                    return;
                }
                super.onResourceReady(picassoDrawable, loadedFrom);
                animationView.setVisibility(8);
                photoView.setImageDrawable(picassoDrawable);
            }

            @Override // com.squareup.picasso.PicassoDrawableTarget
            public final void onLoadStarted(Drawable drawable) {
                Object[] objArr2 = {drawable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6762786e46f0a5449d22f27d8eb042ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6762786e46f0a5449d22f27d8eb042ac");
                    return;
                }
                super.onLoadStarted(drawable);
                photoView.setImageDrawable(drawable);
                animationView.setVisibility(0);
            }
        });
        photoView.setOnViewTapListener(new d.f() { // from class: com.sankuai.waimai.ugc.creator.ability.album.preview.MediaPreviewPagerFragment.2
            public static ChangeQuickRedirect a;

            @Override // uk.co.senab.photoview.d.f
            public final void a(View view2, float f, float f2) {
                Object[] objArr2 = {view2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "604a650ba85a72b41c9ad7a4d12e036d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "604a650ba85a72b41c9ad7a4d12e036d");
                } else {
                    MediaPreviewPagerFragment.this.getActivity().onBackPressed();
                }
            }
        });
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b1fc8f4096b43db9097bd86771382b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b1fc8f4096b43db9097bd86771382b");
        } else {
            super.onDestroy();
        }
    }
}
