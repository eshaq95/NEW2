<%@ page import="model.users.Books.Book" %>
<%@ page import="java.util.ArrayList" %>
<!doctype html>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">


    <title>Checkout example for Bootstrap</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/checkout/">

    <!-- Bootstrap core CSS -->
    <link href="../../dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="form-validation.css" rel="stylesheet">
    <link rel="stylesheet" href="CloseButton.css">

</head>

<body class="bg-light">

<div class="container">
    <div class="py-5 text-center">
        <img class="d-block mx-auto mb-4" src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg"
             alt="" width="72" height="72">
        <h2>Books</h2>
        <p class="lead">Search for your book in our catalogue!</p>
    </div>

    <div class="row spaceBetween">


        <div class="card flexDirection" style="width: 58%;">

            <div class="card-body">
                <img src="harrypotter.jpg" class="card-img-top" alt="...">
                <h5 class="card-title">Card title</h5>
                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                    card's content.</p>
                <input type="submit" class="btn btn-primary" value="Add to cart" onclick="klikaj('rad1')">
            </div>


            <div class="card-body">
                <img src="harrypotter.jpg" class="card-img-top" alt="...">
                <h5 class="card-title">Card title</h5>
                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                    card's content.</p>
                <input type="submit" class="btn btn-primary" value="Add to cart" onclick="klikaj('rad2')">
            </div>


            <% ArrayList<Book> books = (ArrayList<Book>) request.getAttribute("books");
                for (Book book : books) { %>
            <div class="card-body">
                <img src=<%=book.getImg() %> class="card-img-top" alt="...">
                <h5 class="card-title"><%=book.getTitle() %>
                </h5>
                <p class="card-text"><%=book.getBookDescription() %>
                </p>
                <input type="submit" class="btn btn-primary" value="Add to cart" onclick="klikaj('rad1')">
            </div>
        </div>

        <% } %>


        <div class="col-md-4 order-md-2 mb-4">
            <h4 class="d-flex justify-content-between align-items-center mb-3">
                <span class="text-muted">Your cart</span>
            </h4>


            <ul class="list-group mb-3">

                <li class="list-group-item lh-condensed" id="rad1" style="visibility: hidden">

                    <button class="flash-close" type="button">
                        <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16"
                             data-view-component="true"
                             class="octicon">
                            <path fill-rule="evenodd"
                                  d="M3.72 3.72a.75.75 0 011.06 0L8 6.94l3.22-3.22a.75.75 0 111.06 1.06L9.06 8l3.22 3.22a.75.75 0 11-1.06 1.06L8 9.06l-3.22 3.22a.75.75 0 01-1.06-1.06L6.94 8 3.72 4.78a.75.75 0 010-1.06z"></path>
                        </svg>
                    </button>
                    <div>

                        <h6 class="my-0">TitleBook</h6>
                        <small class="text-muted">Brief description</small>
                    </div>

                </li>

                <li class="list-group-item lh-condensed" id="rad2" style="visibility: hidden">

                    <button class="flash-close" type="button">
                        <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16"
                             data-view-component="true"
                             class="octicon">
                            <path fill-rule="evenodd"
                                  d="M3.72 3.72a.75.75 0 011.06 0L8 6.94l3.22-3.22a.75.75 0 111.06 1.06L9.06 8l3.22 3.22a.75.75 0 11-1.06 1.06L8 9.06l-3.22 3.22a.75.75 0 01-1.06-1.06L6.94 8 3.72 4.78a.75.75 0 010-1.06z"></path>
                        </svg>
                    </button>
                    <div>

                        <h6 class="my-0">TitleBook</h6>
                        <small class="text-muted">Brief description</small>
                    </div>

                </li>
                <li class="list-group-item bg-light">
                    <div class="text-success">
                        <h6 class="my-0">Promo code</h6>
                        <small>EXAMPLECODE</small>
                    </div>

                </li>
                <li class="list-group-item d-flex justify-content-between">
                    <span>Total (EUR)</span>

                </li>
            </ul>

            <form class="card p-2">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Promo code">
                    <div class="input-group-append">
                        <button type="submit" class="btn btn-secondary">Redeem</button>
                    </div>
                </div>
            </form>
        </div>


        </form>
    </div>
</div>


</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
<script src="../../assets/js/vendor/popper.min.js"></script>
<script src="../../dist/js/bootstrap.min.js"></script>
<script src="../../assets/js/vendor/holder.min.js"></script>
<script>
    // Example starter JavaScript for disabling form submissions if there are invalid fields
    (function () {
        'use strict';

        window.addEventListener('load', function () {
            // Fetch all the forms we want to apply custom Bootstrap validation styles to
            var forms = document.getElementsByClassName('needs-validation');

            // Loop over them and prevent submission
            var validation = Array.prototype.filter.call(forms, function (form) {
                form.addEventListener('submit', function (event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    })();


    /* Get all elements with class name */

    function validateForm() {
        event.preventDefault();
        var password = document.getElementById("password").value;
        var repeatePassword = document.getElementById("cnfrmPassword").value;
        console.log(password, repeatePassword);
        var myDiv = document.getElementsByClassName("authentication")[0];
        if (password != repeatePassword) {

            myDiv.style.display = 'block';
            console.log(myDiv);

        } else {
            myDiv.style.display = 'none';
        }


    }


    /* Get all elements with class name */
    var closebtns = document.getElementsByClassName("flash-close");
    var i;

    /* Loop through the elements, and hide the parent, when clicked on */
    for (i = 0; i < closebtns.length; i++) {
        closebtns[i].addEventListener("click", function () {
            this.parentElement.style.display = 'none';
        });
    }

    function klikaj(i) {
        document.getElementById(i).style.visibility = 'visible';
    }

</script>

<div>


</div>


</body>
</html>
