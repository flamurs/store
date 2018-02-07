/**
 * Copyright (c) 2015-present, Facebook, Inc. All rights reserved.
 *
 * You are hereby granted a non-exclusive, worldwide, royalty-free license to
 * use, copy, modify, and distribute this software in source code or binary
 * form for use in connection with the web services and APIs provided by
 * Facebook.
 *
 * As with any software that integrates with the Facebook platform, your use
 * of this software is subject to the Facebook Developer Principles and
 * Policies [http://developers.facebook.com/policy/]. This copyright notice
 * shall be included in all copies or substantial portions of the software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 */

import com.facebook.ads.sdk.*;
import java.io.File;
import java.util.Arrays;

public class SAMPLE_CODE {
  public static void main (String args[]) throws APIException {

    String access_token = "EAAbNXFqsKKEBAB1W1iOyKscSUpUgcQBsz7vZAqQCZC5Q4AQMS78Oj3YAZBaG6LwmyszZC5E0ZA7zZAFNjRExb8WPZAPEG7XEqsLuDswT8exYBBaX3rZAmO2KF2CZAZCYkEWAnj6FkIFGzdhEIfGQ7U3oUwzUdJuBY5XMnpHq1XzRggeQRiZC88cF33rcfZAPWPN654o72FgM4KZChV1aoRfJVOHBMOZBhRfGXKnu4ZD";
    String ad_account_id = "116687719150461";
    String app_secret = "6a754e7f8db5cae194ec902df2c114c4";
    String app_id = "1914646402181281";
    APIContext context = new APIContext(access_token).enableDebug(true);

    new AdAccount(ad_account_id, context).getInsights()
      .setLevel(AdsInsights.EnumLevel.VALUE_ADSET)
      .setFiltering("[]")
      .setBreakdowns(List<AdsInsights.EnumBreakdowns>.VALUE_["DAYS_1"])
      .setTimeRange("{\"since\":\"2018-02-01\",\"until\":\"2018-02-08\"}")
      .requestField("results")
      .requestField("result_rate")
      .requestField("social_reach")
      .requestField("social_impressions")
      .requestField("impressions")
      .requestField("frequency")
      .requestField("reach")
      .requestField("delivery")
      .requestField("total_unique_actions")
      .requestField("relevance_score:positive_feedback")
      .requestField("relevance_score:negative_feedback")
      .requestField("spend")
      .requestField("today_spend")
      .requestField("impressions_gross")
      .requestField("impressions_auto_refresh")
      .execute();
  }
}
