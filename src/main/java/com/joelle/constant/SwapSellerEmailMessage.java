package com.joelle.constant;

import com.joelle.entity.Posting;
import com.joelle.entity.User;

public class SwapSellerEmailMessage {


public static String buildSwapSellerEmail(User loggedInUser, User postedUser, Posting post) {
	return "\r\n" + 
			"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n" + 
			"<html xmlns=\"http://www.w3.org/1999/xhtml\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><meta name=\"viewport\" content=\"initial-scale=1.0\"><meta name=\"format-detection\" content=\"telephone=no\"><title>MOSAICO Responsive Email Designer</title><style type=\"text/css\">.socialLinks {font-size: 6px;}\r\n" + 
			".socialLinks a {display: inline-block;}\r\n" + 
			".socialIcon {display: inline-block;vertical-align: top;padding-bottom: 0px;border-radius: 100%;}\r\n" + 
			"table.vb-row.fullwidth {border-spacing: 0;padding: 0;}\r\n" + 
			"table.vb-container.fullpad {border-spacing: 18px;padding-left: 0;padding-right: 0;}\r\n" + 
			"table.vb-container.fullwidth {padding-left: 0;padding-right: 0;}</style><style type=\"text/css\">\r\n" + 
			"    /* yahoo, hotmail */\r\n" + 
			"    .ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div{ line-height: 100%; }\r\n" + 
			"    .yshortcuts a{ border-bottom: none !important; }\r\n" + 
			"    .vb-outer{ min-width: 0 !important; }\r\n" + 
			"    .RMsgBdy, .ExternalClass{\r\n" + 
			"      width: 100%;\r\n" + 
			"      background-color: #3f3f3f;\r\n" + 
			"      background-color: #3f3f3f}\r\n" + 
			"\r\n" + 
			"    /* outlook */\r\n" + 
			"    table{ mso-table-rspace: 0pt; mso-table-lspace: 0pt; }\r\n" + 
			"    #outlook a{ padding: 0; }\r\n" + 
			"    img{ outline: none; text-decoration: none; border: none; -ms-interpolation-mode: bicubic; }\r\n" + 
			"    a img{ border: none; }\r\n" + 
			"\r\n" + 
			"    @media screen and (max-device-width: 600px), screen and (max-width: 600px) {\r\n" + 
			"      table.vb-container, table.vb-row{\r\n" + 
			"        width: 95% !important;\r\n" + 
			"      }\r\n" + 
			"\r\n" + 
			"      .mobile-hide{ display: none !important; }\r\n" + 
			"      .mobile-textcenter{ text-align: center !important; }\r\n" + 
			"\r\n" + 
			"      .mobile-full{\r\n" + 
			"        float: none !important;\r\n" + 
			"        width: 100% !important;\r\n" + 
			"        max-width: none !important;\r\n" + 
			"        padding-right: 0 !important;\r\n" + 
			"        padding-left: 0 !important;\r\n" + 
			"      }\r\n" + 
			"      img.mobile-full{\r\n" + 
			"        width: 100% !important;\r\n" + 
			"        max-width: none !important;\r\n" + 
			"        height: auto !important;\r\n" + 
			"      }   \r\n" + 
			"    }\r\n" + 
			"  </style><style type=\"text/css\">#ko_sideArticleBlock_5 .links-color a, #ko_sideArticleBlock_5 .links-color a:link, #ko_sideArticleBlock_5 .links-color a:visited, #ko_sideArticleBlock_5 .links-color a:hover {color: #3f3f3f;color: #3f3f3f;text-decoration: underline;}\r\n" + 
			"#ko_sideArticleBlock_3 .links-color a, #ko_sideArticleBlock_3 .links-color a:link, #ko_sideArticleBlock_3 .links-color a:visited, #ko_sideArticleBlock_3 .links-color a:hover {color: #3f3f3f;color: #3f3f3f;text-decoration: underline;}\r\n" + 
			"#ko_sideArticleBlock_6 .links-color a:visited, #ko_sideArticleBlock_6 .links-color a:hover {color: #3f3f3f;color: #3f3f3f;text-decoration: underline;}\r\n" + 
			"#ko_footerBlock_2 .links-color a:visited, #ko_footerBlock_2 .links-color a:hover {color: #ccc;color: #ccc;text-decoration: underline;}</style></head><body bgcolor=\"#3f3f3f\" text=\"#919191\" alink=\"#cccccc\" vlink=\"#cccccc\" style=\"margin: 0;padding: 0;background-color: #3f3f3f;color: #919191;\">\r\n" + 
			"\r\n" + 
			"  <center>\r\n" + 
			"\r\n" + 
			"  <!-- preheaderBlock -->\r\n" + 
			"  \r\n" + 
			"\r\n" + 
			"  <table class=\"vb-outer\" width=\"100%\" cellpadding=\"0\" border=\"0\" cellspacing=\"0\" bgcolor=\"#3f3f3f\" style=\"background-color: #3f3f3f;\" id=\"ko_preheaderBlock_1\"><tbody><tr><td class=\"vb-outer\" align=\"center\" valign=\"top\" bgcolor=\"#3f3f3f\" style=\"padding-left: 9px;padding-right: 9px;background-color: #3f3f3f;\">\r\n" + 
			"        <div style=\"display: none; font-size: 1px; color: #333333; line-height: 1px; max-height: 0px; max-width: 0px; opacity: 0; overflow: hidden;\"></div>\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"570\"><tr><td align=\"center\" valign=\"top\"><![endif]-->\r\n" + 
			"        <div class=\"oldwebkit\" style=\"max-width: 570px;\">\r\n" + 
			"        <table width=\"570\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"vb-row halfpad\" bgcolor=\"#3f3f3f\" style=\"border-collapse: separate;border-spacing: 0;padding-left: 9px;padding-right: 9px;width: 100%;max-width: 570px;background-color: #3f3f3f;\"><tbody><tr><td align=\"center\" valign=\"top\" bgcolor=\"#3f3f3f\" style=\"font-size: 0; background-color: #3f3f3f;\">\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"552\"><tr><![endif]-->\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><td align=\"left\" valign=\"top\" width=\"276\"><![endif]--> \r\n" + 
			"<div style=\"display: inline-block; max-width: 276px; vertical-align: top; width: 100%;\" class=\"mobile-full\"> \r\n" + 
			"                    <table class=\"vb-content\" border=\"0\" cellspacing=\"9\" cellpadding=\"0\" width=\"276\" style=\"border-collapse: separate;width: 100%;\" align=\"left\"><tbody><tr><td width=\"100%\" valign=\"top\" align=\"left\" style=\"font-weight: normal; text-align: left; font-size: 13px; font-family: Arial, Helvetica, sans-serif; color: #ffffff;\">\r\n" + 
			"                          <a style=\"text-decoration: underline; color: #ffffff;\" target=\"_new\" href=\"%5Bunsubscribe_link%5D\"></a> \r\n" + 
			"                          \r\n" + 
			"                        </td>\r\n" + 
			"                      </tr></tbody></table></div><!--[if (gte mso 9)|(lte ie 8)]>\r\n" + 
			"</td><td align=\"left\" valign=\"top\" width=\"276\">\r\n" + 
			"<![endif]--><div style=\"display: inline-block; max-width: 276px; vertical-align: top; width: 100%;\" class=\"mobile-full mobile-hide\"> \r\n" + 
			"\r\n" + 
			"                    <table class=\"vb-content\" border=\"0\" cellspacing=\"9\" cellpadding=\"0\" width=\"276\" style=\"border-collapse: separate;width: 100%;text-align: right;\" align=\"left\"><tbody><tr><td width=\"100%\" valign=\"top\" style=\"font-weight: normal; font-size: 13px; font-family: Arial, Helvetica, sans-serif; color: #ffffff;\">\r\n" + 
			"                      <span style=\"color: #ffffff; text-decoration: underline;\">\r\n" + 
			"                          <a href=\"%5Bshow_link%5D\" style=\"text-decoration: underline; color: #ffffff;\" target=\"_new\">View in your browser</a>\r\n" + 
			"                         </span>\r\n" + 
			"                       </td>\r\n" + 
			"                      </tr></tbody></table></div><!--[if (gte mso 9)|(lte ie 8)]>\r\n" + 
			"</td></tr></table><![endif]-->\r\n" + 
			"\r\n" + 
			"            </td>\r\n" + 
			"          </tr></tbody></table></div>\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]></td></tr></table><![endif]-->\r\n" + 
			"      </td>\r\n" + 
			"    </tr></tbody></table><!-- /preheaderBlock --><table class=\"vb-outer\" width=\"100%\" cellpadding=\"0\" border=\"0\" cellspacing=\"0\" bgcolor=\"#F05F40\" style=\"background-color: #F05F40;\" id=\"ko_getTitle"
			+ "Block_4\"><tbody><tr><td class=\"vb-outer\" align=\"center\" valign=\"top\" bgcolor=\"#F05F40\" style=\"padding-left: 9px;padding-right: 9px;background-color: #F05F40;\">\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"570\"><tr><td align=\"center\" valign=\"top\"><![endif]-->\r\n" + 
			"        <div class=\"oldwebkit\" style=\"max-width: 570px;\">\r\n" + 
			"        <table width=\"570\" border=\"0\" cellpadding=\"0\" cellspacing=\"9\" class=\"vb-container halfpad\" bgcolor=\"#ffffff\" style=\"border-collapse: separate;border-spacing: 9px;padding-left: 9px;padding-right: 9px;width: 100%;max-width: 570px;background-color: #fff;\"><tbody><tr><td bgcolor=\"#ffffff\" align=\"center\" style=\"background-color: #ffffff; font-size: 22px; font-family: Arial, Helvetica, sans-serif; color: #3f3f3f; text-align: center;\">\r\n" + 
			"              <span>You have a new Swap!</span>\r\n" + 
			"            </td>\r\n" + 
			"          </tr></tbody></table></div>\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]></td></tr></table><![endif]-->\r\n" + 
			"      </td>\r\n" + 
			"    </tr></tbody></table><table class=\"vb-outer\" width=\"100%\" cellpadding=\"0\" border=\"0\" cellspacing=\"0\" bgcolor=\"#F05F40\" style=\"background-color: #F05F40;\" id=\"ko_sideArticleBlock_5\"><tbody><tr><td class=\"vb-outer\" align=\"center\" valign=\"top\" bgcolor=\"#F05F40\" style=\"padding-left: 9px;padding-right: 9px;background-color: #F05F40;\">\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"570\"><tr><td align=\"center\" valign=\"top\"><![endif]-->\r\n" + 
			"        <div class=\"oldwebkit\" style=\"max-width: 570px;\">\r\n" + 
			"        <table width=\"570\" border=\"0\" cellpadding=\"0\" cellspacing=\"9\" class=\"vb-row fullpad\" bgcolor=\"#ffffff\" style=\"border-collapse: separate;border-spacing: 9px;width: 100%;max-width: 570px;background-color: #fff;\"><tbody><tr><td align=\"center\" class=\"mobile-row\" valign=\"top\" style=\"font-size: 0;\">\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"552\"><tr><![endif]-->\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><td align=\"left\" valign=\"top\" width=\"184\"><![endif]--> \r\n" + 
			"<div class=\"mobile-full\" style=\"display: inline-block; max-width: 184px; vertical-align: top; width: 100%;\"> \r\n" + 
			"\r\n" + 
			"                          	<div class=\"col-lg-3 col-md-6 text-center\">\r\n" + 
			"					<div class=\"service-box\">\r\n" + 
			"						<i class=\"fa fa-4x fa-diamond text-primary sr-icons\"></i>\r\n" + 
			"						<i class=\"fa fa-4x fa-paper-plane text-primary sr-icons\"></i>\r\n" + 
			"						<i class=\"fa fa-4x fa-newspaper-o text-primary sr-icons\"></i>\r\n" + 
			"						<i class=\"fa fa-4x fa-heart text-primary sr-icons\"></i><br>\r\n" + 
			"					</div>\r\n" + 
			"				</div>\r\n" + 
			"<![endif]--><!--[if (gte mso 9)|(lte ie 8)]>\r\n" + 
			"<td align=\"left\" valign=\"top\" width=\"368\">\r\n" + 
			"<![endif]--><div class=\"mobile-full\" style=\"display: inline-block; max-width: 368px; vertical-align: top; width: 100%;\"> \r\n" + 
			"\r\n" + 
			"                    <table class=\"vb-content\" border=\"0\" cellspacing=\"9\" cellpadding=\"0\" width=\"368\" align=\"left\" style=\"border-collapse: separate;width: 100%;\"><tbody><tr><td style=\"font-size: 18px; font-family: Arial, Helvetica, sans-serif; color: #3f3f3f; text-align: left;\">\r\n" + 
			"                          <span style=\"color: #3f3f3f;\"> Your Post: "+post.getTitle()+"</span>\r\n" + 
			"                        </td>\r\n" + 
			"                      </tr><tr><td align=\"left\" class=\"long-text links-color\" style=\"text-align: left; font-size: 13px; font-family: Arial, Helvetica, sans-serif; color: #3f3f3f;\"><p style=\"margin: 1em 0px;margin-bottom: 0px;margin-top: 0px;\">"+post.getDescription()+"<br></p></td>\r\n" + 
			"                      </tr><tr><td valign=\"top\">\r\n" + 
			"                    </td>\r\n" + 
			"                      </tr></tbody></table></div><!--[if (gte mso 9)|(lte ie 8)]></td>\r\n" + 
			"<![endif]-->\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]></tr></table><![endif]-->\r\n" + 
			"\r\n" + 
			"            </td>\r\n" + 
			"          </tr></tbody></table></div>\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]></td></tr></table><![endif]-->\r\n" + 
			"      </td>\r\n" + 
			"    </tr></tbody></table><table class=\"vb-outer\" width=\"100%\" cellpadding=\"0\" border=\"0\" cellspacing=\"0\" bgcolor=\"#F05F40\" style=\"background-color: #F05F40;\" id=\"ko_sideArticleBlock_3\"><tbody><tr><td class=\"vb-outer\" align=\"center\" valign=\"top\" bgcolor=\"#F05F40\" style=\"padding-left: 9px;padding-right: 9px;background-color: #F05F40;\">\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"570\"><tr><td align=\"center\" valign=\"top\"><![endif]-->\r\n" + 
			"        <div class=\"oldwebkit\" style=\"max-width: 570px;\">\r\n" + 
			"        <table width=\"570\" border=\"0\" cellpadding=\"0\" cellspacing=\"9\" class=\"vb-row fullpad\" bgcolor=\"#ffffff\" style=\"border-collapse: separate;border-spacing: 9px;width: 100%;max-width: 570px;background-color: #fff;\"><tbody><tr><td align=\"center\" class=\"mobile-row\" valign=\"top\" style=\"font-size: 0;\">\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"552\"><tr><![endif]-->\r\n" + 
			"  \r\n" + 
			"<td align=\"left\" valign=\"top\" width=\"414\">\r\n" + 
			"<![endif]--><div class=\"mobile-full\" style=\"display: inline-block; max-width: 414px; vertical-align: top; width: 100%;\"> \r\n" + 
			"\r\n" + 
			"                    <table class=\"vb-content\" border=\"0\" cellspacing=\"9\" cellpadding=\"0\" width=\"414\" align=\"left\" style=\"border-collapse: separate;width: 100%;\"><tbody><tr><td style=\"font-size: 18px; font-family: Arial, Helvetica, sans-serif; color: #3f3f3f; text-align: left;\">\r\n" + 
			"                          <span style=\"color: #3f3f3f;\">Rate "+postedUser.getFirstName()+"</span>\r\n" + 
			"                        </td>\r\n" + 
			"                      </tr><tr><td align=\"left\" class=\"long-text links-color\" style=\"text-align: left; font-size: 13px; font-family: Arial, Helvetica, sans-serif; color: #3f3f3f;\"><p style=\"margin: 1em 0px;margin-bottom: 0px;margin-top: 0px;\">After the swap has been completed, please visit your home page rate your interaction based on how communicating and interacting with "+postedUser.getFirstName()+" went.<br></p></td>\r\n" + 
			"                      </tr><tr><td valign=\"top\">\r\n" + 
			"                          <table cellpadding=\"0\" border=\"0\" align=\"left\" cellspacing=\"0\" class=\"mobile-full\" style=\"padding-top: 4px;\"><tbody><tr><td width=\"auto\" valign=\"middle\" bgcolor=\"#F05F40\" align=\"center\" height=\"26\" style=\"font-size: 13px; font-family: Arial, Helvetica, sans-serif; text-align: center; color: #3f3f3f; font-weight: normal; padding-left: 18px; padding-right: 18px; background-color: #F05F40; border-radius: 4px;\">\r\n" + 
			"                                <a style=\"text-decoration: none; color: #3f3f3f; font-weight: normal;\" target=\"_new\" href=\"\">BUTTON</a>\r\n" + 
			"                              </td>\r\n" + 
			"                            </tr></tbody></table></td>\r\n" + 
			"                      </tr></tbody></table></div><!--[if (gte mso 9)|(lte ie 8)]></td>\r\n" + 
			"<![endif]-->\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]></tr></table><![endif]-->\r\n" + 
			"\r\n" + 
			"            </td>\r\n" + 
			"          </tr></tbody></table></div>\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]></td></tr></table><![endif]-->\r\n" + 
			"      </td>\r\n" + 
			"    </tr></tbody></table><table class=\"vb-outer\" width=\"100%\" cellpadding=\"0\" border=\"0\" cellspacing=\"0\" bgcolor=\"#F05F40\" style=\"background-color: #F05F40;\" id=\"ko_hrBlock_7\"><tbody><tr><td class=\"vb-outer\" align=\"center\" valign=\"top\" bgcolor=\"#F05F40\" style=\"padding-left: 9px;padding-right: 9px;background-color: #F05F40;\">\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"570\"><tr><td align=\"center\" valign=\"top\"><![endif]-->\r\n" + 
			"        <div class=\"oldwebkit\" style=\"max-width: 570px;\">\r\n" + 
			"        <table width=\"570\" border=\"0\" cellpadding=\"0\" cellspacing=\"9\" class=\"vb-container halfpad\" bgcolor=\"#ffffff\" style=\"border-collapse: separate;border-spacing: 9px;padding-left: 9px;padding-right: 9px;width: 100%;max-width: 570px;background-color: #fff;\"><tbody><tr><td valign=\"top\" bgcolor=\"#ffffff\" align=\"center\" style=\"background-color: #ffffff;\">\r\n" + 
			"              <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" style=\"width: 100%;\"><tbody><tr><td width=\"100%\" height=\"1\" style=\"font-size: 1px; line-height: 1px; width: 100%; background-color: #3f3f3f;\"> </td>\r\n" + 
			"                </tr></tbody></table></td>\r\n" + 
			"          </tr></tbody></table></div>\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]></td></tr></table><![endif]-->\r\n" + 
			"      </td>\r\n" + 
			"    </tr></tbody></table><table class=\"vb-outer\" width=\"100%\" cellpadding=\"0\" border=\"0\" cellspacing=\"0\" bgcolor=\"#F05F40\" style=\"background-color: #F05F40;\" id=\"ko_sideArticleBlock_6\"><tbody><tr><td class=\"vb-outer\" align=\"center\" valign=\"top\" bgcolor=\"#F05F40\" style=\"padding-left: 9px;padding-right: 9px;background-color: #F05F40;\">\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"570\"><tr><td align=\"center\" valign=\"top\"><![endif]-->\r\n" + 
			"        <div class=\"oldwebkit\" style=\"max-width: 570px;\">\r\n" + 
			"        <table width=\"570\" border=\"0\" cellpadding=\"0\" cellspacing=\"9\" class=\"vb-row fullpad\" bgcolor=\"#ffffff\" style=\"border-collapse: separate;border-spacing: 9px;width: 100%;max-width: 570px;background-color: #fff;\"><tbody><tr><td align=\"center\" class=\"mobile-row\" valign=\"top\" style=\"font-size: 0;\">\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"552\"><tr><![endif]-->\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]>\r\n" + 
			"<td align=\"left\" valign=\"top\" width=\"414\">\r\n" + 
			"<![endif]--><div class=\"mobile-full\" style=\"display: inline-block; max-width: 414px; vertical-align: top; width: 100%;\"> \r\n" + 
			"\r\n" + 
			"                    <table class=\"vb-content\" border=\"0\" cellspacing=\"9\" cellpadding=\"0\" width=\"414\" align=\"center\" style=\"border-collapse: separate;width: 100%;\"><tbody>\r\n" + 
			"                        <td style=\"font-size: 18px; font-family: Arial, Helvetica, sans-serif; color: #3f3f3f; text-align: center;\">\r\n" + 
			"                          <span style=\"color: #3f3f3f;\">Your SwaPoints: "+loggedInUser.getSwaPointsBalance()+"\r\n" + 
			"                        </td>\r\n" + 
			"                        </tbody></table></td>\r\n" + 
			"                      </tr></tbody></table></div><!--[if (gte mso 9)|(lte ie 8)]></td>\r\n" + 
			"<![endif]--><!--[if (gte mso 9)|(lte ie 8)]>\r\n" + 
			"<td align=\"left\" valign=\"top\" width=\"138\" style=\"; \">\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]></tr></table><![endif]-->\r\n" + 
			"\r\n" + 
			"            </td>\r\n" + 
			"          </tr></tbody></table></div>\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]></td></tr></table><![endif]-->\r\n" + 
			"      </td>\r\n" + 
			"    </tr></tbody></table><!-- footerBlock --><table width=\"100%\" cellpadding=\"0\" border=\"0\" cellspacing=\"0\" bgcolor=\"#3f3f3f\" style=\"background-color: #3f3f3f;\" id=\"ko_footerBlock_2\"><tbody><tr><td align=\"center\" valign=\"top\" bgcolor=\"#3f3f3f\" style=\"background-color: #3f3f3f;\">\r\n" + 
			"\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]><table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"570\"><tr><td align=\"center\" valign=\"top\"><![endif]-->\r\n" + 
			"        <div class=\"oldwebkit\" style=\"max-width: 570px;\">\r\n" + 
			"        <table width=\"570\" style=\"border-collapse: separate;border-spacing: 9px;padding-left: 9px;padding-right: 9px;width: 100%;max-width: 570px;\" border=\"0\" cellpadding=\"0\" cellspacing=\"9\" class=\"vb-container halfpad\" align=\"center\"><tbody><tr><td class=\"long-text links-color\" style=\"text-align: center; font-size: 13px; color: #919191; font-weight: normal; text-align: center; font-family: Arial, Helvetica, sans-serif;\"><p style=\"margin: 1em 0px;margin-bottom: 0px;margin-top: 0px;\">Email sent to <a href=\"mailto:%5Bmail%5D\" style=\"color: #ccc;text-decoration: underline;\">[mail]</a></p></td>\r\n" + 
			"          </tr><tr><td style=\"text-align: center;\">\r\n" + 
			"              <a href=\"%5Bunsubscribe_link%5D\" style=\"text-decoration: underline; color: #ffffff; text-align: center; font-size: 13px; font-weight: normal; font-family: Arial, Helvetica, sans-serif;\" target=\"_new\"><span>Unsubscribe</span></a>\r\n" + 
			"            </td>\r\n" + 
			"          </tr><tr style=\"text-align: center;\"><td align=\"center\">\r\n" + 
			"           \r\n" + 
			"            </td>\r\n" + 
			"          </tr></tbody></table></div>\r\n" + 
			"<!--[if (gte mso 9)|(lte ie 8)]></td></tr></table><![endif]-->\r\n" + 
			"      </td>\r\n" + 
			"    </tr></tbody></table><!-- /footerBlock --></center>\r\n" + 
			"\r\n" + 
			"</body></html>\r\n" + 
			"";	
}
	
}
