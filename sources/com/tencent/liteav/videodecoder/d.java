package com.tencent.liteav.videodecoder;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    private boolean a = false;

    public byte[] a(byte[] bArr) throws IOException {
        if (this.a) {
            String str = "";
            for (byte b : bArr) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str = str + StringUtil.SPACE + hexString;
            }
            new StringBuilder("old SPS:").append(str);
        }
        return a(new ByteArrayInputStream(bArr));
    }

    public byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c cVar = new c(inputStream, byteArrayOutputStream);
        cVar.b(8, "NALU type");
        int a = (int) cVar.a(8, "SPS: profile_idc");
        cVar.b(8, "SPS: constraint_set_0-3_flag and reserved_zero_4bits");
        cVar.a(8, "SPS: level_idc");
        cVar.b("SPS: seq_parameter_set_id");
        if (a == 100 || a == 110 || a == 122 || a == 144) {
            if (cVar.a("SPS: chroma_format_idc") == 3) {
                cVar.b(1, "SPS: residual_color_transform_flag");
            }
            cVar.b("SPS: bit_depth_luma_minus8");
            cVar.b("SPS: bit_depth_chroma_minus8");
            cVar.b(1, "SPS: qpprime_y_zero_transform_bypass_flag");
            if (cVar.d("SPS: seq_scaling_matrix_present_lag")) {
                for (int i = 0; i < 8; i++) {
                    if (cVar.d("SPS: seqScalingListPresentFlag")) {
                        if (i < 6) {
                            cVar.c(16);
                        } else {
                            cVar.c(64);
                        }
                    }
                }
            }
        }
        cVar.b("SPS: log2_max_frame_num_minus4");
        int a2 = cVar.a("SPS: pic_order_cnt_type");
        if (a2 == 0) {
            cVar.b("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (a2 == 1) {
            cVar.b(1, "SPS: delta_pic_order_always_zero_flag");
            cVar.b("SPS: offset_for_non_ref_pic");
            cVar.b("SPS: offset_for_top_to_bottom_field");
            int a3 = cVar.a("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            for (int i2 = 0; i2 < a3; i2++) {
                cVar.b("SPS: offsetForRefFrame [" + i2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            }
        }
        int a4 = cVar.a("SPS: num_ref_frames");
        if (this.a) {
            new StringBuilder("SPS: num_ref_frames: ").append(a4);
        }
        cVar.b(1, "SPS: gaps_in_frame_num_value_allowed_flag");
        cVar.b("SPS: pic_width_in_mbs_minus1");
        cVar.b("SPS: pic_height_in_map_units_minus1");
        if (!cVar.d("SPS: frame_mbs_only_flag")) {
            cVar.b(1, "SPS: mb_adaptive_frame_field_flag");
        }
        cVar.b(1, "SPS: direct_8x8_inference_flag");
        if (cVar.d("SPS: frame_cropping_flag")) {
            cVar.b("SPS: frame_crop_left_offset");
            cVar.b("SPS: frame_crop_right_offset");
            cVar.b("SPS: frame_crop_top_offset");
            cVar.b("SPS: frame_crop_bottom_offset");
        }
        if (cVar.e("SPS: vui_parameters_present_flag")) {
            cVar.a(true, "VUI set 1: ");
            b(cVar);
        } else {
            cVar.a(true, "VUI set 1: ");
            cVar.a(false, "VUI: aspect_ratio_info_present_flag");
            cVar.a(false, "VUI: overscan_info_present_flag");
            cVar.a(false, "VUI: video_signal_type_present_flag");
            cVar.a(false, "VUI: chroma_loc_info_present_flag");
            cVar.a(false, "VUI: timing_info_present_flag");
            cVar.a(false, "VUI: nal_hrd_parameters_present_flag");
            cVar.a(false, "VUI: vcl_hrd_parameters_present_flag");
            cVar.a(false, "VUI: pic_struct_present_flag");
            cVar.a(true, "VUI: bitstream_restriction_flag");
            cVar.a(true, "VUI: motion_vectors_over_pic_boundaries_flag");
            cVar.c(0, "VUI: max_bytes_per_pic_denom");
            cVar.c(0, "VUI: max_bits_per_mb_denom");
            cVar.c(10, "VUI: log2_max_mv_length_horizontal");
            cVar.c(10, "VUI: log2_max_mv_length_vertical");
            cVar.c(0, "VUI: num_reorder_frames");
            cVar.c(1, "VUI: max_dec_frame_buffering");
        }
        cVar.c();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (this.a) {
            String str = "";
            for (byte b : byteArray) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str = str + StringUtil.SPACE + hexString;
            }
            new StringBuilder("new SPS:").append(str);
        }
        return byteArray;
    }

    private void a(c cVar) throws IOException {
        int a = cVar.a("SPS: cpb_cnt_minus1");
        cVar.b(4, "HRD: bit_rate_scale");
        cVar.b(4, "HRD: cpb_size_scale");
        for (int i = 0; i <= a; i++) {
            cVar.b("HRD: bit_rate_value_minus1");
            cVar.b("HRD: cpb_size_value_minus1");
            cVar.b(1, "HRD: cbr_flag");
        }
        cVar.b(5, "HRD: initial_cpb_removal_delay_length_minus1");
        cVar.b(5, "HRD: cpb_removal_delay_length_minus1");
        cVar.b(5, "HRD: dpb_output_delay_length_minus1");
        cVar.b(5, "HRD: time_offset_length");
    }

    private void b(c cVar) throws IOException {
        if (cVar.d("VUI: aspect_ratio_info_present_flag") && ((int) cVar.a(8, "VUI: aspect_ratio")) == 255) {
            cVar.b(16, "VUI: sar_width");
            cVar.b(16, "VUI: sar_height");
        }
        if (cVar.d("VUI: overscan_info_present_flag")) {
            cVar.b(1, "VUI: overscan_appropriate_flag");
        }
        if (cVar.d("VUI: video_signal_type_present_flag")) {
            cVar.b(3, "VUI: video_format");
            cVar.b(1, "VUI: video_full_range_flag");
            if (cVar.d("VUI: colour_description_present_flag")) {
                cVar.b(8, "VUI: colour_primaries");
                cVar.b(8, "VUI: transfer_characteristics");
                cVar.b(8, "VUI: matrix_coefficients");
            }
        }
        if (cVar.d("VUI: chroma_loc_info_present_flag")) {
            cVar.b("VUI chroma_sample_loc_type_top_field");
            cVar.b("VUI chroma_sample_loc_type_bottom_field");
        }
        if (cVar.d("VUI: timing_info_present_flag")) {
            cVar.b(32, "VUI: num_units_in_tick");
            cVar.b(32, "VUI: time_scale");
            cVar.b(1, "VUI: fixed_frame_rate_flag");
        }
        boolean d = cVar.d("VUI: nal_hrd_parameters_present_flag");
        if (d) {
            a(cVar);
        }
        boolean d2 = cVar.d("VUI: vcl_hrd_parameters_present_flag");
        if (d2) {
            a(cVar);
        }
        if (d || d2) {
            cVar.b(1, "VUI: low_delay_hrd_flag");
        }
        cVar.b(1, "VUI: pic_struct_present_flag");
        if (cVar.e("VUI: bitstream_restriction_flag")) {
            cVar.a(true, "VUI: set bitstream_restriction_flag");
            cVar.d("VUI: motion_vectors_over_pic_boundaries_flag");
            cVar.b("VUI max_bytes_per_pic_denom");
            cVar.b("VUI max_bits_per_mb_denom");
            cVar.b("VUI log2_max_mv_length_horizontal");
            cVar.b("VUI log2_max_mv_length_vertical");
            cVar.b("VUI num_reorder_frames");
            cVar.c(1, "VUI: max_dec_frame_buffering");
            return;
        }
        cVar.a(true, "VUI: set bitstream_restriction_flag");
        cVar.a(true, "VUI: motion_vectors_over_pic_boundaries_flag");
        cVar.c(0, "VUI: max_bytes_per_pic_denom");
        cVar.c(0, "VUI: max_bits_per_mb_denom");
        cVar.c(10, "VUI: log2_max_mv_length_horizontal");
        cVar.c(10, "VUI: log2_max_mv_length_vertical");
        cVar.c(0, "VUI: num_reorder_frames");
        cVar.c(1, "VUI: max_dec_frame_buffering");
    }
}
