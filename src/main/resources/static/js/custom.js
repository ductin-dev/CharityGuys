/*------------------------------------*\
    Custom JavaScript
\*------------------------------------*/
(function($) {
    "use strict";
    $(window).load(function() {
        /* -------------------------------------------------------------
            Preloader
        ------------------------------------------------------------- */
        if ($('.preloader').length){
            $(".preloader").delay(300).fadeOut("slow");
        }
    });
    

    $(document).ready(function() {
        /* -------------------------------------------------------------
            Menu Dropdown
        ------------------------------------------------------------- */
        if($(window).width() > 768) {
            $("#header--fixed").headroom({
              "offset": 150,
              "tolerance": 5,
              "classes": {
                "initial": "animated",
                "pinned": "slideInDown",
                "unpinned": "slideOutUp"
              }
            });

            $('#main-navbar .dropdown').on('mouseenter',function(){
                $(this).find('.dropdown-menu').first().stop(true, true).delay(300).slideDown();
            });

            $('#main-navbar .dropdown').on('mouseleave',function(){
                $(this).find('.dropdown-menu').first().stop(true, true).delay(100).slideUp();
            });
        } else {
            $('ul.dropdown-menu [data-toggle=dropdown]').on('click', function(event) {
                event.preventDefault(); 
                event.stopPropagation(); 
                $(this).parent().siblings().removeClass('open');
                $(this).parent().toggleClass('open');
            });
        }

        /* -------------------------------------------------------------
            Fact Counter
        ------------------------------------------------------------- */
        if ( $('.fact-count').length){
            $('.fact-count').counterUp({
                delay: 10,
                time: 1000
            });
        }


        /* -------------------------------------------------------------
            Sidebar - Category Toggle
        ------------------------------------------------------------- */
        if ( $('.widget-category .category-list').length){
            $('.widget-category .category-list').each(function(){
                if ($(this).find('ul.list-child').length > 0) {
                    $(this).append('<i class="closed fa fa-angle-down"></i>');
                }
                $(this).find('ul.list-child').hide();
            });
            $( "body" ).on( "click", '.category-list .closed', function(){
                $(this).parent().find('ul.list-child').show(500);
                $(this).removeClass('closed').removeClass('fa-angle-down').addClass('opened').addClass('fa-angle-up');
            });
            $( "body" ).on( "click", '.category-list .opened', function(){
                $(this).parent().find('ul.list-child').hide(500);
                $(this).removeClass('opened').removeClass('fa-angle-up').addClass('closed').addClass('fa-angle-down');
            });
        }
        
        
        /* -------------------------------------------------------------
            All FAQ Accordian... Starting with FAQ in id
        ------------------------------------------------------------- */
        if ( $('.faq-section div[id^="faq"]').length){
            $('.faq-section div[id^="faq"]').accordion({
                active: false,
                collapsible: true,
                icons: false,
                heightStyle: "content"
            });
        }

        /* -------------------------------------------------------------
            Common Accordian
        ------------------------------------------------------------- */
		if ( $('#accordian').length){
            $('#accordian').accordion({
                collapsible: true,
                icons: false,
                heightStyle: "content"
            });
        }

        /* -------------------------------------------------------------
            Scroll To Top
        ------------------------------------------------------------- */
        $.scrollUp({
            scrollText: '<i class="fa fa-angle-up"></i>',
        });


        /* -------------------------------------------------------------
            Home Slider
        ------------------------------------------------------------- */
        if ($('.home-slider').length){
            $('.home-slider').owlCarousel({
                nav:true,
                items: 1
            });
        }


        /* -------------------------------------------------------------
            Variables
        ------------------------------------------------------------- */
        var leftArrow = '<i class="fa fa-chevron-left"></i>';
        var rightArrow = '<i class="fa fa-chevron-right"></i>';

        /* -------------------------------------------------------------
            Testimonial Carousel
        ------------------------------------------------------------- */
        if ($('.testimonial-carousel').length){
            $('.testimonial-carousel').owlCarousel({
                loop:true,
                nav:true,
                navText: [leftArrow, rightArrow],
                items: 1
            });
        }


        /* -------------------------------------------------------------
            Event Carousel
        ------------------------------------------------------------- */
        if ($('#event-carousel').length){
            $('#event-carousel').owlCarousel({
                nav:true,
                navText: [leftArrow, rightArrow],
                items: 1
            });
        }

        
        /* -------------------------------------------------------------
            Gallery Carousel
        ------------------------------------------------------------- */
        if ($('.photo-carousel').length){
            $('.photo-carousel').owlCarousel({
                loop:true,
                nav:true,
                navText: [leftArrow, rightArrow],
                responsive:{
                    0:{
                        items:1
                    },
                    600:{
                        items:3
                    },
                    1000:{
                        items:4
                    }
                }
            });
        }

        /* -------------------------------------------------------------
            Inner linking
        ------------------------------------------------------------- */
        if ($('a[href^="#"]').length){
            $('a[href^="#"]').not("#scrollUp").on('click',function (e) {
                e.preventDefault();
                var target = this.hash;
                var $target = $(target);
                $('html, body').stop().animate({
                     'scrollTop': $target.offset().top
                }, 900, 'swing');
            });
        }

        
        /* -------------------------------------------------------------
            Team Isotop Filter
        ------------------------------------------------------------- */

        function becharity_isotpop_filter(selector, buttonSelector){
            if ($(selector).length){
                var $teamFilter = $(selector).isotope();
                var activeClass = 'active';

                $(buttonSelector).on( 'click', 'button', function() {
                    var filterValue = $(this).attr('data-filter');
                    $teamFilter.isotope({ filter: filterValue });

                    $(buttonSelector).find('.'+activeClass).removeClass(activeClass);
                    $(this).addClass(activeClass);
                });

                $teamFilter.imagesLoaded().progress( function() {
                    $teamFilter.isotope('layout');
                });
            }
        }

        /* -------------------------------------------------------------
            Team Isotop Filter
        ------------------------------------------------------------- */
        becharity_isotpop_filter('.team-isotope','.isotope-team-btn');

        /* -------------------------------------------------------------
            Partner Isotop Filter
        ------------------------------------------------------------- */
        becharity_isotpop_filter('.partner-isotope','.partner-isotope-btn');

        /* -------------------------------------------------------------
            Gallery Isotop Filter
        ------------------------------------------------------------- */
        becharity_isotpop_filter('.gallery-isotope','.gallery-isotope-btn');
       
        /* -------------------------------------------------------------
            Image Gallery Popup
        ------------------------------------------------------------- */
        function becharity_image_popup(selector){
            if ($(selector).length){
                $(selector).magnificPopup({
                    delegate: 'a',
                    type: 'image',
                    gallery: { enabled: true },
                    removalDelay: 500,
                    callbacks: {
                        beforeOpen: function() {
                            this.st.image.markup = this.st.image.markup.replace('mfp-figure', 'mfp-figure mfp-with-anim');
                            this.st.mainClass = this.st.el.attr('data-effect');
                        }
                    },
                    closeOnContentClick: true,
                    midClick: true
                });
            }
        }

        /* -------------------------------------------------------------
            Gallery image Popup
        ------------------------------------------------------------- */
        becharity_image_popup('.gallery-section .thumb');

        /* -------------------------------------------------------------
            Product image Popup
        ------------------------------------------------------------- */
        becharity_image_popup('.single-product-thumbnails');


        /* -------------------------------------------------------------
            Sticky Sidebar
        ------------------------------------------------------------- */
        function becharity_sticky_sidebar(selector, offsetTop){
            if ( $(selector).length && $(window).width() > 767){
                $(selector).stick_in_parent({offset_top: offsetTop});
                $(selector)
                .on('sticky_kit:bottom', function(e) {
                    $(this).parent().css('position', 'static');
                })
                .on('sticky_kit:unbottom', function(e) {
                    $(this).parent().css('position', 'relative');
                })
            }
        }   
        /* -------------------------------------------------------------
            FAQ Page Sticky Sidebar
        ------------------------------------------------------------- */
        becharity_sticky_sidebar('#cause-sticky',50);

        /* -------------------------------------------------------------
            FAQ Page Sticky Sidebar
        ------------------------------------------------------------- */
        becharity_sticky_sidebar('#faq-sticky',50);

        /* -------------------------------------------------------------
            Event Page Sticky Sidebar
        ------------------------------------------------------------- */
        becharity_sticky_sidebar('#event-sticky',50);

        /* -------------------------------------------------------------
            Cart Page Sticky Sidebar
        ------------------------------------------------------------- */
        becharity_sticky_sidebar('#cart-sticky',80);

        /* -------------------------------------------------------------
            Count Down
        ------------------------------------------------------------- */
        function becharity_countdown(selector,date){
            if ( $(selector).length){
                $(selector).countdown(date).on('update.countdown', function(event) {
                  var $this = $(this).html(event.strftime(''
                    + '<div><span>%D</span> d </div>'
                    + '<div><span>%H</span> h </div>'
                    + '<div><span>%M</span> m </div>'
                    + '<div><span>%S</span> s </div>'));
                });
            }
        }

        becharity_countdown('#count1','2017/2/25');
        becharity_countdown('#count2','2017/2/31');
        becharity_countdown('#count3','2017/3/11');

        
        /* -------------------------------------------------------------
            Google Map
        ------------------------------------------------------------- */
        var map;
        window.initMap = function() {
            if ( $('#map').length){
                map = new google.maps.Map(document.getElementById('map'), {
                center: {lat: -34.397, lng: 150.644},
                zoom: 8
                });
            }
        }
    });
})(jQuery);
