
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import models.User

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Option[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user:Option[User]=None):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Google single sign on with play scala")/*4.47*/ {_display_(Seq[Any](format.raw/*4.49*/("""
  """),format.raw/*5.3*/("""<h1>Google single sign on with play scala</h1>
  <div class="modal-body" """),_display_(/*6.28*/if(user.isDefined)/*6.46*/{_display_(Seq[Any](format.raw/*6.47*/("""style="display: none;"""")))}/*6.70*/else/*6.74*/{_display_(Seq[Any](format.raw/*6.75*/("""style="display: flex;"""")))}),format.raw/*6.98*/(""">
    <h4 style="color:black; margin:10px;">Sign in with """),_display_(/*7.57*/user/*7.61*/.isDefined),format.raw/*7.71*/("""</h4>
    <!-- Display Google sign-in button -->
    <div class="btn-outline-light me-2 text-white" data-bs-toggle="modal" data-bs-target="#staticBackdrop"><div class="g-signin2" id="googleButton" """),_display_(/*9.150*/if(!user.isDefined)/*9.169*/{_display_(Seq[Any](format.raw/*9.170*/("""data-onsuccess="onSignIn"""")))}),format.raw/*9.196*/("""></div></div>
  </div>
  """),_display_(/*11.4*/if(user.isDefined)/*11.22*/{_display_(Seq[Any](format.raw/*11.23*/("""
    """),format.raw/*12.5*/("""<div>
      <img src='"""),_display_(/*13.18*/user/*13.22*/.get.profilePictureLink),format.raw/*13.45*/("""'>
      <h3>ID:&nbsp;&nbsp;"""),_display_(/*14.27*/user/*14.31*/.get.userID),format.raw/*14.42*/("""</h3>
      <h3>E-mail:&nbsp;&nbsp;"""),_display_(/*15.31*/user/*15.35*/.get.email),format.raw/*15.45*/("""</h3>
      <h3>Name:&nbsp;&nbsp;"""),_display_(/*16.29*/user/*16.33*/.get.userName),format.raw/*16.46*/("""</h3>
      <a onclick="signOut()" href="#">Sign out</a>
    </div>
  """)))}),format.raw/*19.4*/("""
  """),format.raw/*20.3*/("""<script src="https://apis.google.com/js/platform.js" async defer></script>
  <meta name="google-signin-client_id" content="665271835264-30g0heq6gmv9hrmvkb034oq6ln2s8vrk.apps.googleusercontent.com">
  <script src="https://apis.google.com/js/platform.js?onload=renderButton" async defer></script>
  <script>
      function onSignIn(googleUser) """),format.raw/*24.37*/("""{"""),format.raw/*24.38*/("""
        """),format.raw/*25.9*/("""const auth2 = gapi.auth2.getAuthInstance();
        const authToken = googleUser.getAuthResponse(true).id_token
        window.location.href = '/signIn?authToken=' + authToken
      """),format.raw/*28.7*/("""}"""),format.raw/*28.8*/("""
      """),format.raw/*29.7*/("""function signOut() """),format.raw/*29.26*/("""{"""),format.raw/*29.27*/("""
          """),format.raw/*30.11*/("""var auth2 = gapi.auth2.getAuthInstance();
          auth2.signOut().then(function () """),format.raw/*31.44*/("""{"""),format.raw/*31.45*/("""
              """),format.raw/*32.15*/("""console.log("signOut")
          """),format.raw/*33.11*/("""}"""),format.raw/*33.12*/(""");

          auth2.disconnect();
          window.location.href = '/'
      """),format.raw/*37.7*/("""}"""),format.raw/*37.8*/("""
  """),format.raw/*38.3*/("""</script>
  <script src="https://apis.google.com/js/platform.js?onload=renderButton" async defer></script>
""")))}),format.raw/*40.2*/("""
"""))
      }
    }
  }

  def render(user:Option[User]): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((Option[User]) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 979cf92c33106c3908d5f876d1aac5116514033f
                  MATRIX: 432->1|761->21|879->46|906->48|959->93|998->95|1027->98|1127->172|1153->190|1191->191|1232->214|1244->218|1282->219|1335->242|1419->300|1431->304|1461->314|1686->512|1714->531|1753->532|1810->558|1862->584|1889->602|1928->603|1960->608|2010->631|2023->635|2067->658|2123->687|2136->691|2168->702|2231->738|2244->742|2275->752|2336->786|2349->790|2383->803|2484->874|2514->877|2884->1219|2913->1220|2949->1229|3158->1411|3186->1412|3220->1419|3267->1438|3296->1439|3335->1450|3448->1535|3477->1536|3520->1551|3581->1584|3610->1585|3714->1662|3742->1663|3772->1666|3910->1774
                  LINES: 17->1|22->2|27->3|28->4|28->4|28->4|29->5|30->6|30->6|30->6|30->6|30->6|30->6|30->6|31->7|31->7|31->7|33->9|33->9|33->9|33->9|35->11|35->11|35->11|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|43->19|44->20|48->24|48->24|49->25|52->28|52->28|53->29|53->29|53->29|54->30|55->31|55->31|56->32|57->33|57->33|61->37|61->37|62->38|64->40
                  -- GENERATED --
              */
          